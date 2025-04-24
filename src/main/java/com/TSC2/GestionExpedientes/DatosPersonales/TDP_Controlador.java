package com.TSC2.GestionExpedientes.DatosPersonales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/datos-personales")
public class TDP_Controlador {

    @Autowired
    private TDP_Servicios datosPersonalesServicios;

    @GetMapping
    public List<TDP_Modelo> obtenerTodos() {
        return datosPersonalesServicios.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TDP_Modelo> obtenerPorId(@PathVariable Integer id) {
        Optional<TDP_Modelo> datosPersonales = datosPersonalesServicios.obtenerPorId(id);
        return datosPersonales.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TDP_Modelo guardar(@RequestBody TDP_Modelo datosPersonales) {
        return datosPersonalesServicios.guardar(datosPersonales);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        datosPersonalesServicios.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<TDP_Modelo> actualizar(@PathVariable Integer id, @RequestBody TDP_Modelo nuevosDatos) {
        Optional<TDP_Modelo> existenteOptional = datosPersonalesServicios.obtenerPorId(id);
        if (existenteOptional.isPresent()) {
            TDP_Modelo existente = existenteOptional.get();

            if (nuevosDatos.getNombre() != null)
                existente.setNombre(nuevosDatos.getNombre());
            if (nuevosDatos.getApellidoPaterno() != null)
                existente.setApellidoPaterno(nuevosDatos.getApellidoPaterno());
            if (nuevosDatos.getApellidoMaterno() != null)
                existente.setApellidoMaterno(nuevosDatos.getApellidoMaterno());
            if (nuevosDatos.getCurp() != null)
                existente.setCurp(nuevosDatos.getCurp());
            if (nuevosDatos.getTelefono() != null)
                existente.setTelefono(nuevosDatos.getTelefono());
            if (nuevosDatos.getDireccion() != null)
                existente.setDireccion(nuevosDatos.getDireccion());

            TDP_Modelo actualizado = datosPersonalesServicios.guardar(existente);
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
