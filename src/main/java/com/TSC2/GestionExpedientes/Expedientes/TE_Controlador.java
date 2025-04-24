package com.TSC2.GestionExpedientes.Expedientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/expedientes")
public class TE_Controlador {

    @Autowired
    private TE_Servicios expedientesServicios;

    @GetMapping
    public List<TE_Modelo> obtenerTodos() {
        return expedientesServicios.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TE_Modelo> obtenerPorId(@PathVariable Integer id) {
        Optional<TE_Modelo> expediente = expedientesServicios.obtenerPorId(id);
        return expediente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TE_Modelo guardar(@RequestBody TE_Modelo expediente) {
        return expedientesServicios.guardar(expediente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        expedientesServicios.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
