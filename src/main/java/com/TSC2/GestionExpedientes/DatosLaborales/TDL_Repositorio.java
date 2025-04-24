package com.TSC2.GestionExpedientes.DatosLaborales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TDL_Repositorio extends JpaRepository<TDL_Modelo, Integer> {
}