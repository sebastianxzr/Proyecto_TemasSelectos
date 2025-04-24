package com.TSC2.GestionExpedientes.UsuarioExpediente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TUE_Servicios {

    @Autowired
    private TUE_Repositorio usuarioExpedienteRepositorio;

    public List<TUE_Modelo> obtenerTodos() {
        return usuarioExpedienteRepositorio.findAll();
    }

    public Optional<TUE_Modelo> obtenerPorId(TUE_Id id) {
        return usuarioExpedienteRepositorio.findById(id);
    }

    public TUE_Modelo guardar(TUE_Modelo usuarioExpediente) {
        return usuarioExpedienteRepositorio.save(usuarioExpediente);
    }

    public void eliminar(TUE_Id id) {
        usuarioExpedienteRepositorio.deleteById(id);
    }
}
