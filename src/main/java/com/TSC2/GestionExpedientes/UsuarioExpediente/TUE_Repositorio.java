package com.TSC2.GestionExpedientes.UsuarioExpediente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TUE_Repositorio extends JpaRepository<TUE_Modelo, TUE_Id> {
}