package com.TSC2.GestionExpedientes.Documentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/documentos")
public class TD_Controlador {

    @Autowired
    private TD_Servicios documentosServicios;

    @GetMapping
    public List<TD_Modelo> obtenerTodos() {
        return documentosServicios.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TD_Modelo> obtenerPorId(@PathVariable Integer id) {
        Optional<TD_Modelo> documento = documentosServicios.obtenerPorId(id);
        return documento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TD_Modelo guardar(@RequestBody TD_Modelo documento) {
        return documentosServicios.guardar(documento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        documentosServicios.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}