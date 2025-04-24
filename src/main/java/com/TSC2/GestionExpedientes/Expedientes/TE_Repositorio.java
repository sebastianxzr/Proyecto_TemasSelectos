package com.TSC2.GestionExpedientes.Expedientes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TE_Repositorio extends JpaRepository<TE_Modelo, Integer> {
}