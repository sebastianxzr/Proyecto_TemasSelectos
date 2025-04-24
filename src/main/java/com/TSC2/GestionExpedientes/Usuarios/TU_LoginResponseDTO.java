package com.TSC2.GestionExpedientes.Usuarios;

import com.TSC2.GestionExpedientes.Usuarios.TU_Modelo.Rol;

public class TU_LoginResponseDTO {
    private String usuario;
    private TU_Modelo.Rol rol;

    public TU_LoginResponseDTO(String usuario, Rol rol) {
        this.usuario = usuario;
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
