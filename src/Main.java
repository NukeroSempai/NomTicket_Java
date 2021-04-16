
import modelo.Producto;
import modelo.ProductoDAO;
import SEGURIDAD.encriptadorHash;
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
        System.out.println(encriptadorHash.getHash(clave));
        System.out.println(clave);
        vistas.LoginForm inicio = new LoginForm();
        inicio.setVisible(true);
        
    }
    
}
