package com.TSC2.GestionExpedientes.DatosEmpresa;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "datosempresa")
public class TDE_Modelo {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @Column(name = "idDatosEmpresa")
    private Integer idDatosEmpresa;
    @Basic
    @Column(name = "razonSocial", length = 255, nullable = false)
    private String razonSocial;
    @Column(name = "rfc", length = 13, nullable = false, unique = true)
    private String rfc;
    @Column(name = "direccion", length = 255, nullable = false)
    private String direccion;
    @Column(name = "giroEmpresarial", length = 100, nullable = false)
    private String giroEmpresarial;
    @Column(name = "regimenFiscal", length = 50, nullable = false)
    private String regimenFiscal;
    @Column(name = "telefono", length = 20, nullable = false)
    private String telefono;
    @Column(name = "pais", length = 100, nullable = false)
    private String pais;

    public Integer getIdDatosEmpresa() {
        return idDatosEmpresa;
    }

    public void setIdDatosEmpresa(Integer idDatosEmpresa) {
        this.idDatosEmpresa = idDatosEmpresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGiroEmpresarial() {
        return giroEmpresarial;
    }

    public void setGiroEmpresarial(String giroEmpresarial) {
        this.giroEmpresarial = giroEmpresarial;
    }

    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    public void setRegimenFiscal(String regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
