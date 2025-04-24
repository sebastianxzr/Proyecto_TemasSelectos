package com.TSC2.GestionExpedientes.UsuarioExpediente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario-expediente")
public class TUE_Controlador {

    @Autowired
    private TUE_Servicios usuarioExpedienteServicios;

    @GetMapping
    public List<TUE_Modelo> obtenerTodos() {
        return usuarioExpedienteServicios.obtenerTodos();
    }

    @GetMapping("/{idUsuario}/{idExpediente}")
    public ResponseEntity<Optional<TUE_Modelo>> obtenerPorId(@PathVariable Integer idUsuario,
            @PathVariable Integer idExpediente) {
        TUE_Id id = new TUE_Id(idUsuario, idExpediente);
        Optional<TUE_Modelo> entidad = usuarioExpedienteServicios.obtenerPorId(id);
        return entidad != null ? ResponseEntity.ok(entidad) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public TUE_Modelo guardar(@RequestBody TUE_Modelo usuarioExpediente) {
        return usuarioExpedienteServicios.guardar(usuarioExpediente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable TUE_Id id) {
        usuarioExpedienteServicios.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
