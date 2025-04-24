package com.TSC2.GestionExpedientes.UsuarioExpediente;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TUE_Id implements Serializable {
    private Integer idUsuario;
    private Integer idExpediente;

    public TUE_Id() {
    }

    public TUE_Id(Integer idUsuario, Integer idExpediente) {
        this.idUsuario = idUsuario;
        this.idExpediente = idExpediente;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(Integer idExpediente) {
        this.idExpediente = idExpediente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TUE_Id that = (TUE_Id) o;
        return Objects.equals(idUsuario, that.idUsuario) &&
                Objects.equals(idExpediente, that.idExpediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idExpediente);
    }
}