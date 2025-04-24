
package com.TSC2.GestionExpedientes.DatosLaborales;

import java.math.BigDecimal;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "datoslaborales")
public class TDL_Modelo {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @Column(name = "idDatosLaborales")
    private Integer idDatosLaborales;
    @Basic
    @Column(name = "rfc", length = 13, nullable = false, unique = true)
    private String rfc;
    @Column(name = "nss", length = 20, nullable = false, unique = true)
    private String nss;
    @Column(name = "sueldo", precision = 10, scale = 2, nullable = false)
    private BigDecimal sueldo;
    @Column(name = "antiguedad", nullable = false)
    private Integer antiguedad;
    @Column(name = "puesto", length = 100, nullable = false)
    private String puesto;

    public Integer getIdDatosLaborales() {
        return idDatosLaborales;
    }

    public void setIdDatosLaborales(Integer idDatosLaborales) {
        this.idDatosLaborales = idDatosLaborales;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
