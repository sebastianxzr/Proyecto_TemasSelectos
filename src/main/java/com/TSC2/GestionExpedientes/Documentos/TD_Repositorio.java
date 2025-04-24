package com.TSC2.GestionExpedientes.Documentos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TD_Repositorio extends JpaRepository<TD_Modelo, Integer> {
}