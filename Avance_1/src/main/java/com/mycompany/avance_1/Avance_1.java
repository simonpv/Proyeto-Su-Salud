/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avance_1;

import com.mycompany.avance_1.IGU.GllegadaP;
import com.mycompany.avance_1.IGU.Pantalla;
import com.mycompany.avance_1.IGU.SeleccionP;

/**
 *
 * @author josep
 */
public class Avance_1 {

    public static void main(String[] args) {
        
        Cola C_Regular = new Cola("R"); //
        Cola C_Preferencial = new Cola("P"); //
        
        // Simulación de llegada de pacientes
        Ficha ficha1 = new Ficha(null, "12345678", "Juan Pérez");
        Ficha ficha2 = new Ficha(null, "87654321", "Ana Gómez");
        
        // Simulación de llegada de pacientes regulares y preferenciales
        C_Regular.enColar(new Dato("Paciente Regular"));
        C_Regular.enColar(new Dato("Paciente Regular"));
        C_Preferencial.enColar(new Dato("Paciente Preferencial"));
        C_Preferencial.enColar(new Dato("Paciente Preferencial"));
        
        // Mostrar el contenido de las colas
        System.out.println("Cola Regular:\n" + C_Regular.toString());
        System.out.println("Cola Preferencial:\n" + C_Preferencial.toString());
        
    
        SeleccionP seleccion = new SeleccionP(C_Regular, C_Preferencial); // Crea la instancia de Seleccion
        seleccion.setVisible(false); // Muestra la ventana
        seleccion.setLocationRelativeTo(null);
        
        GllegadaP pGestionar = new GllegadaP(seleccion);
        pGestionar.setVisible(false);
        pGestionar.setLocationRelativeTo(null);
    
        Pantalla bienvenida = new Pantalla(pGestionar);
        bienvenida.setVisible(true);
        bienvenida.setLocationRelativeTo(null);
        
        seleccion.LlamarGestionar(pGestionar);
        
    }
    
}
