package com.TSC2.GestionExpedientes.DatosPersonales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TDP_Servicios {

    @Autowired
    private TDP_Repositorio datosPersonalesRepositorio;

    public List<TDP_Modelo> obtenerTodos() {
        return datosPersonalesRepositorio.findAll();
    }

    public Optional<TDP_Modelo> obtenerPorId(Integer id) {
        return datosPersonalesRepositorio.findById(id);
    }

    public TDP_Modelo guardar(TDP_Modelo datosPersonales) {
        return datosPersonalesRepositorio.save(datosPersonales);
    }

    public void eliminar(Integer id) {
        datosPersonalesRepositorio.deleteById(id);
    }
}
