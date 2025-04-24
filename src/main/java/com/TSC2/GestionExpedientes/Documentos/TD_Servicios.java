package com.TSC2.GestionExpedientes.Documentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TD_Servicios {

    @Autowired
    private TD_Repositorio documentosRepositorio;

    public List<TD_Modelo> obtenerTodos() {
        return documentosRepositorio.findAll();
    }

    public Optional<TD_Modelo> obtenerPorId(Integer id) {
        return documentosRepositorio.findById(id);
    }

    public TD_Modelo guardar(TD_Modelo documento) {
        return documentosRepositorio.save(documento);
    }

    public void eliminar(Integer id) {
        documentosRepositorio.deleteById(id);
    }
}
