package com.TSC2.GestionExpedientes.DatosPersonales;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "datospersonales")
public class TDP_Modelo {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @Column(name = "idDatosPersonales")
    private Integer idDatosPersonales;
    @Basic
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellidoPaterno", length = 50, nullable = false)
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno", length = 50, nullable = false)
    private String apellidoMaterno;
    @Column(name = "direccion", length = 255, nullable = false)
    private String direccion;
    @Column(name = "telefono", length = 20, nullable = false)
    private String telefono;
    @Column(name = "curp", length = 18, nullable = false, unique = true)
    private String curp;

    public Integer getIdDatosPersonales() {
        return idDatosPersonales;
    }

    public void setIdDatosPersonales(Integer idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
}
