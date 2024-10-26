/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance_1;
import java.sql.Timestamp;
import java.util.Date;


/**
 *
 * @author XPC
 */
public class Ficha {
    private String numeroFicha;
    private String cedula;
    private String nombre;
    private Timestamp fechaHoraLlegada;

    // Constructor
    public Ficha(String numeroFicha, String cedula, String nombre) {
        this.numeroFicha = numeroFicha;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaHoraLlegada = new Timestamp(new Date().getTime()); // Asigna el TIMESTAMP actual
    }

    // Getters y Setters
    public String getNumeroFicha() {
        return numeroFicha;
    }

    public void setNumeroFicha(String numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Timestamp getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(Timestamp fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    @Override
    public String toString() {
        return "Ficha{" +
               "numeroFicha='" + numeroFicha + '\'' +
               ", cedula='" + cedula + '\'' +
               ", nombre='" + nombre + '\'' +
               ", fechaHoraLlegada=" + fechaHoraLlegada +
               '}';
    }
}
