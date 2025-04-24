package com.TSC2.GestionExpedientes.Expedientes;

import java.util.Date;
import com.TSC2.GestionExpedientes.DatosEmpresa.TDE_Modelo;
import com.TSC2.GestionExpedientes.DatosLaborales.TDL_Modelo;
import com.TSC2.GestionExpedientes.DatosPersonales.TDP_Modelo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "expedientes")
public class TE_Modelo {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @Column(name = "idExpediente")
    private Integer idExpediente;
    @ManyToOne
    @JoinColumn(name = "idDatosPersonales", referencedColumnName = "idDatosPersonales")
    private TDP_Modelo idDatosPersonales;
    @ManyToOne
    @JoinColumn(name = "idDatosLaborales", referencedColumnName = "idDatosLaborales")
    private TDL_Modelo idDatosLaborales;
    @ManyToOne
    @JoinColumn(name = "idDatosEmpresa", referencedColumnName = "idDatosEmpresa")
    private TDE_Modelo idDatosEmpresa;
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private Estado estado;
    @Basic
    @Column(name = "fechaCreacion", nullable = false)
    private Date fechaCreacion;

    public enum Estado {
        Activo,
        Inactivo
    };

    public Integer getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(Integer idExpediente) {
        this.idExpediente = idExpediente;
    }

    public TDP_Modelo getIdDatosPersonales() {
        return idDatosPersonales;
    }

    public void setIdDatosPersonales(TDP_Modelo idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public TDL_Modelo getIdDatosLaborales() {
        return idDatosLaborales;
    }

    public void setIdDatosLaborales(TDL_Modelo idDatosLaborales) {
        this.idDatosLaborales = idDatosLaborales;
    }

    public TDE_Modelo getIdDatosEmpresa() {
        return idDatosEmpresa;
    }

    public void setIdDatosEmpresa(TDE_Modelo idDatosEmpresa) {
        this.idDatosEmpresa = idDatosEmpresa;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}