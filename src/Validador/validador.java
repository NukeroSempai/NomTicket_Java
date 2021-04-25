/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

import javax.swing.JOptionPane;

/**
 *
 * @author Nukero
 */
public class validador {
    
    public static boolean verificarVacio(String dato){
        boolean correcto = false;
        if(dato.length()>0){
            correcto=true;
        }
        return correcto;
    }
    
    public static boolean verificarNumero(String dato){
        boolean correcto = false;
        try {
            Integer.parseInt(dato);
            correcto = true;
        } catch (Exception e) {
        }
        return correcto;
    }
    
}
