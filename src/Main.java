
import modelo.Producto;
import modelo.ProductoDAO;

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
        //CONEXION_BD.Conexion.conectar();
        modelo.ProductoDAO nn = new ProductoDAO();                
        Object[]o = new Object[]{36,"frutilla","fruta de la estacion",1,999999};
        if(nn.add(o)>0){
            System.out.println("se agrego");
        }else{
            System.out.println("error");
        }
        nn.listar();
        System.out.println("-----------------");
        o = new Object[]{36,"frutillas de oro","*****",1,9999999,36};
        if(nn.actualizar(o)>0){
            System.out.println("se actualizo");
        }else{
            System.out.println("no se actualizo");
        }
        nn.listar();
        System.out.println("-----------------");
        if(nn.eliminar(0)>0){
            System.out.println("se elimino");
        }else{
            System.out.println("no se elimino");
        }
        System.out.println("-----------------");
        nn.listar();
        
    }
    
}
