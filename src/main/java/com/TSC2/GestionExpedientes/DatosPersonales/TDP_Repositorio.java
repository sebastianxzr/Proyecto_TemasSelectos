package com.TSC2.GestionExpedientes.DatosPersonales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TDP_Repositorio extends JpaRepository<TDP_Modelo, Integer> {
}