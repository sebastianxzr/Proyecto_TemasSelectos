package com.TSC2.GestionExpedientes.DatosEmpresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/datos-empresa")
public class TDE_Controlador {

    @Autowired
    private TDE_Servicios datosEmpresaServicios;

    @GetMapping
    public List<TDE_Modelo> obtenerTodos() {
        return datosEmpresaServicios.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TDE_Modelo> obtenerPorId(@PathVariable Integer id) {
        Optional<TDE_Modelo> datosEmpresa = datosEmpresaServicios.obtenerPorId(id);
        return datosEmpresa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TDE_Modelo guardar(@RequestBody TDE_Modelo datosEmpresa) {
        return datosEmpresaServicios.guardar(datosEmpresa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        datosEmpresaServicios.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
