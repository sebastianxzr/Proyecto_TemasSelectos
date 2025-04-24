package com.TSC2.GestionExpedientes.Expedientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TE_Servicios {

    @Autowired
    private TE_Repositorio expedientesRepositorio;

    public List<TE_Modelo> obtenerTodos() {
        return expedientesRepositorio.findAll();
    }

    public Optional<TE_Modelo> obtenerPorId(Integer id) {
        return expedientesRepositorio.findById(id);
    }

    public TE_Modelo guardar(TE_Modelo expediente) {
        return expedientesRepositorio.save(expediente);
    }

    public void eliminar(Integer id) {
        expedientesRepositorio.deleteById(id);
    }
}
