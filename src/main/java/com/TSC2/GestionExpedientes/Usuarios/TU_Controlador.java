package com.TSC2.GestionExpedientes.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class TU_Controlador {

    @Autowired
    private TU_Servicios usuariosServicios;

    @GetMapping
    public List<TU_Modelo> obtenerTodos() {
        return usuariosServicios.obtenerTodos();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<TU_Modelo> obtenerPorId(@PathVariable Integer id) {
        Optional<TU_Modelo> usuario = usuariosServicios.obtenerPorId(id);
        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/usuario/{usuario}")
    public ResponseEntity<TU_LoginResponseDTO> obtenerPorUsuario(@PathVariable String usuario) {
        Optional<TU_LoginResponseDTO> usuarioEncontrado = usuariosServicios.obtenerPorUsuario(usuario);
        return usuarioEncontrado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TU_Modelo guardar(@RequestBody TU_Modelo usuario) {
        return usuariosServicios.guardar(usuario);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        usuariosServicios.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/login")
    public ResponseEntity<TU_LoginResponseDTO> login(@RequestBody TU_LoginDTO loginDTO) {
        Optional<TU_LoginResponseDTO> usuarioLogueado = usuariosServicios.login(loginDTO.getUsuario(),
                loginDTO.getContrasena());
        return usuarioLogueado.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }

}