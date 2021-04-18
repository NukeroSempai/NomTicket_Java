
import SEGURIDAD.seguridad;
import vistas.LoginForm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nukero
 */
public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException {
        String clave = "admin";
        seguridad seg = new seguridad();        
        
        vistas.LoginForm inicio = new LoginForm();
        inicio.setVisible(true);        
    }
    
}
