package com.TSC2.GestionExpedientes.DatosLaborales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/datos-laborales")
public class TDL_Controlador {

    @Autowired
    private TDL_Servicios datosLaboralesServicios;

    @GetMapping
    public List<TDL_Modelo> obtenerTodos() {
        return datosLaboralesServicios.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TDL_Modelo> obtenerPorId(@PathVariable Integer id) {
        Optional<TDL_Modelo> datosLaborales = datosLaboralesServicios.obtenerPorId(id);
        return datosLaborales.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TDL_Modelo guardar(@RequestBody TDL_Modelo datosLaborales) {
        return datosLaboralesServicios.guardar(datosLaborales);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        datosLaboralesServicios.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
