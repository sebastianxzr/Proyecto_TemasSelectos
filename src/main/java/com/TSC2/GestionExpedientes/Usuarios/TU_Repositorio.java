package com.TSC2.GestionExpedientes.Usuarios;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TU_Repositorio extends JpaRepository<TU_Modelo, Integer> {
    Optional<TU_Modelo> findByUsuario(String usuario);
}