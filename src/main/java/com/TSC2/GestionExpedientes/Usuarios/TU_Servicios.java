package com.TSC2.GestionExpedientes.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TU_Servicios {

    @Autowired
    private TU_Repositorio usuariosRepositorio;

    public Optional<TU_LoginResponseDTO> obtenerPorUsuario(String usuario) {
        return usuariosRepositorio.findByUsuario(usuario).map(u -> new TU_LoginResponseDTO(u.getUsuario(), u.getRol()));
    }

    public List<TU_Modelo> obtenerTodos() {
        return usuariosRepositorio.findAll();
    }

    public Optional<TU_Modelo> obtenerPorId(Integer id) {
        return usuariosRepositorio.findById(id);
    }

    public TU_Modelo guardar(TU_Modelo usuario) {
        usuario.setContrasena(new BCryptPasswordEncoder().encode(usuario.getContrasena()));
        return usuariosRepositorio.save(usuario);
    }

    public void eliminar(Integer id) {
        usuariosRepositorio.deleteById(id);
    }

    public Optional<TU_LoginResponseDTO> login(String usuario, String contrasena) {
        Optional<TU_Modelo> usuarioEncontrado = usuariosRepositorio.findByUsuario(usuario);
        if (usuarioEncontrado.isPresent()) {
            TU_Modelo usuarioDTO = usuarioEncontrado.get();
            if (new BCryptPasswordEncoder().matches(contrasena, usuarioDTO.getContrasena())) {
                return Optional.of(new TU_LoginResponseDTO(usuarioDTO.getUsuario(), usuarioDTO.getRol()));
            }
        }
        return Optional.empty();
    }
}
