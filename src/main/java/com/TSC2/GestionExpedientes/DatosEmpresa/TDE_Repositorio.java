package com.TSC2.GestionExpedientes.DatosEmpresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TDE_Repositorio extends JpaRepository<TDE_Modelo, Integer> {
}