package com.TSC2.GestionExpedientes.UsuarioExpediente;

import com.TSC2.GestionExpedientes.Expedientes.TE_Modelo;
import com.TSC2.GestionExpedientes.Usuarios.TU_Modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarioexpediente")
public class TUE_Modelo {
    @EmbeddedId
    private TUE_Id idUsuarioExpediente;
    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", updatable = false, insertable = false)
    private TU_Modelo idUsuario;
    @ManyToOne()
    @JoinColumn(name = "idExpediente", referencedColumnName = "idExpediente", updatable = false, insertable = false)
    private TE_Modelo idExpediente;

    public TUE_Id getIdUsuarioExpediente() {
        return idUsuarioExpediente;
    }

    public void setIdUsuarioExpediente(TUE_Id idUsuarioExpediente) {
        this.idUsuarioExpediente = idUsuarioExpediente;
    }

    public TU_Modelo getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(TU_Modelo idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TE_Modelo getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(TE_Modelo idExpediente) {
        this.idExpediente = idExpediente;
    }
}