/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance_1;

/**
 *
 * @author josep
 */
public class NodoC {
    
    private Dato info;
    private NodoC siguiente;

    public NodoC() {
    }

    public Dato getInfo() {
        return info;
    }

    public void setInfo(Dato info) {
        this.info = info;
    }

    public NodoC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoC Siguiente) {
        this.siguiente = Siguiente;
    }

    @Override
    public String toString() {
        return "NodoC{" + "info=" + info + '}';
    }
    
}
