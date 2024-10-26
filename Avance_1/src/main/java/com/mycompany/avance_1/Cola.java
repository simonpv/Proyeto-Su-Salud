/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance_1;

import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Cola {
    
    private NodoC frente;
    private NodoC ultimo;
    private int contadorRegular = 1; // Para fichas regulares (R)
    private int contadorPreferencial = 1; // Para fichas preferenciales (P)
    private String tipo; // 'R' para regular, 'P' para preferencial

    public Cola(String tipo) {
        this.tipo = tipo; // 'R' para Cola Regular, 'P' para Cola Preferencial
    }

    public NodoC getFrente() {
        return frente;
    }

    public void setFrente(NodoC frente) {
        this.frente = frente;
    }

    public NodoC getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoC ultimo) {
        this.ultimo = ultimo;
    }
    //Metodos micelaneos
    
    public boolean esVacia(){
        if(frente == null){
            return true;
        }else{
            return false;
        }
    }
    public void enColar(Dato nuevoPaciente, Ficha nuevaFicha){
      
        NodoC auxN = new NodoC();
        auxN.setInfo(nuevoPaciente);
        Dato nuevoDato = new Dato();
        
        if (tipo.equals("R")) {
            nuevoPaciente.setNombre("R" + contadorRegular);
            contadorRegular++; // Incrementa el contador regular
        } else if (tipo.equals("P")) {
            nuevoPaciente.setNombre("P" + contadorPreferencial);
            contadorPreferencial++; // Incrementa el contador preferencial
        }
        
        // Almacena la información de la ficha en el nodo
        nuevoDato.setNombre(nuevaFicha.getNombre() + " - Ficha: " + nuevaFicha.getNumeroFicha());
        auxN.setInfo(nuevoDato);
        
        if (esVacia()){
            this.setFrente(auxN);
            this.setUltimo(auxN);
        }else{
            this.getUltimo().setSiguiente(auxN);
            this.setUltimo(auxN);
        }
    }
    
    public void atender(){
        NodoC auxA = new NodoC();
        if(frente != null){
            auxA = this.getFrente();
            frente = this.getFrente().getSiguiente();
            auxA.setSiguiente(null);
        }
    }
    
    public String atenderB(){      // retorna Nombre
        NodoC auxB = new NodoC();
        if(frente != null){
            auxB = this.getFrente();
            frente = this.getFrente().getSiguiente();
            auxB.setSiguiente(null);         
        }
        if(auxB != null){
        return auxB.getInfo().getNombre();
    }else{
        return null;
        }
    
    }
    
    @Override
  public String toString(){
    String buffer = "";
    if (!esVacia()){ // si NO esta vacia la voy a recorrer
        NodoC tempA = frente;
        while(tempA != null){
            buffer = buffer + tempA.getInfo().getNombre() + "\n";
            tempA = tempA.getSiguiente();
        }
    }else{
        System.out.println("La pila esta vacia");
    }
    return buffer;
    
    }
    
}
