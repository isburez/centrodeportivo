/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.centrodeportivo.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Isaias
 */
@Entity
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r")
    , @NamedQuery(name = "Reserva.findById", query = "SELECT r FROM Reserva r WHERE r.id = :id")
    , @NamedQuery(name = "Reserva.findByFecha", query = "SELECT r FROM Reserva r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Reserva.findByHora", query = "SELECT r FROM Reserva r WHERE r.hora = :hora")
    , @NamedQuery(name = "Reserva.findByDuracion", query = "SELECT r FROM Reserva r WHERE r.duracion = :duracion")
    , @NamedQuery(name = "Reserva.findByNombreResponsable", query = "SELECT r FROM Reserva r WHERE r.nombreResponsable = :nombreResponsable")
    , @NamedQuery(name = "Reserva.findByTelefonoResponsable", query = "SELECT r FROM Reserva r WHERE r.telefonoResponsable = :telefonoResponsable")
    , @NamedQuery(name = "Reserva.findByIdentificacionResponsable", query = "SELECT r FROM Reserva r WHERE r.identificacionResponsable = :identificacionResponsable")
    , @NamedQuery(name = "Reserva.findByCancha", query = "SELECT r FROM Reserva r WHERE r.cancha = :cancha")
    , @NamedQuery(name = "Reserva.findByValor", query = "SELECT r FROM Reserva r WHERE r.valor = :valor")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 2147483647)
    @Column(name = "hora")
    private String hora;
    @Size(max = 2147483647)
    @Column(name = "duracion")
    private String duracion;
    @Size(max = 2147483647)
    @Column(name = "nombre_responsable")
    private String nombreResponsable;
    @Size(max = 2147483647)
    @Column(name = "telefono_responsable")
    private String telefonoResponsable;
    @Size(max = 2147483647)
    @Column(name = "identificacion_responsable")
    private String identificacionResponsable;
    @Size(max = 2147483647)
    @Column(name = "cancha")
    private String cancha;
    @Size(max = 2147483647)
    @Column(name = "valor")
    private String valor;

    public Reserva() {
    }

    public Reserva(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getTelefonoResponsable() {
        return telefonoResponsable;
    }

    public void setTelefonoResponsable(String telefonoResponsable) {
        this.telefonoResponsable = telefonoResponsable;
    }

    public String getIdentificacionResponsable() {
        return identificacionResponsable;
    }

    public void setIdentificacionResponsable(String identificacionResponsable) {
        this.identificacionResponsable = identificacionResponsable;
    }

    public String getCancha() {
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.centrodeportivo.entidades.Reserva[ id=" + id + " ]";
    }
    
}
