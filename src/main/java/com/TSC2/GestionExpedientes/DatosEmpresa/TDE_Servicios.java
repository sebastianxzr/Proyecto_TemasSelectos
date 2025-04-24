package com.TSC2.GestionExpedientes.DatosEmpresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TDE_Servicios {

    @Autowired
    private TDE_Repositorio datosEmpresaRepositorio;

    public List<TDE_Modelo> obtenerTodos() {
        return datosEmpresaRepositorio.findAll();
    }

    public Optional<TDE_Modelo> obtenerPorId(Integer id) {
        return datosEmpresaRepositorio.findById(id);
    }

    public TDE_Modelo guardar(TDE_Modelo datosEmpresa) {
        return datosEmpresaRepositorio.save(datosEmpresa);
    }

    public void eliminar(Integer id) {
        datosEmpresaRepositorio.deleteById(id);
    }
}