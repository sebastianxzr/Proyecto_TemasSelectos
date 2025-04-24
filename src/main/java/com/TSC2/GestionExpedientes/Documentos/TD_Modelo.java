package com.TSC2.GestionExpedientes.Documentos;

import java.util.Date;
import com.TSC2.GestionExpedientes.Expedientes.TE_Modelo;
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
@Table(name = "documentos")
public class TD_Modelo {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @Column(name = "idDocumento")
    private Integer idDocumento;
    @ManyToOne
    @JoinColumn(name = "idExpediente", referencedColumnName = "idExpediente")
    private TE_Modelo idExpediente;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoDocumento", nullable = false)
    private TipoDocumento tipoDocumento;
    @Basic
    @Column(name = "nombreArchivo", length = 255, nullable = false, unique = true)
    private String nombreArchivo;
    @Column(name = "rutaArchivo", nullable = false, length = 255, unique = true)
    private String rutaArchivo;
    @Column(name = "fechaSubida", nullable = false)
    private Date fechaSubida;

    public enum TipoDocumento {
        CURP,
        RFC,
        NSS,
        ActaNacimiento
    };

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumentos(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public TE_Modelo getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(TE_Modelo idExpediente) {
        this.idExpediente = idExpediente;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public Date getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }
}