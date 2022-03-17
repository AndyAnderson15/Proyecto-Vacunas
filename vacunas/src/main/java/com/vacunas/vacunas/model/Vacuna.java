package com.vacunas.vacunas.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Vacuna")


public class Vacuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvacuna")
    private Long idVacuna;

    @Column(name = "tipovacuna")
    private String vacuna;

    @Column(name = "dosis")
    private String dosis;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "idempleado")
    private Long idempleado;


    public Long getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Long idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public Long getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Long idempleado) {
        this.idempleado = idempleado;
    }
}
