package com.TSC2.GestionExpedientes.DatosLaborales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TDL_Servicios {

    @Autowired
    private TDL_Repositorio datosLaboralesRepositorio;

    public List<TDL_Modelo> obtenerTodos() {
        return datosLaboralesRepositorio.findAll();
    }

    public Optional<TDL_Modelo> obtenerPorId(Integer id) {
        return datosLaboralesRepositorio.findById(id);
    }

    public TDL_Modelo guardar(TDL_Modelo datosLaborales) {
        return datosLaboralesRepositorio.save(datosLaborales);
    }

    public void eliminar(Integer id) {
        datosLaboralesRepositorio.deleteById(id);
    }
}
