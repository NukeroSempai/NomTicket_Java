
package CONEXION_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    public static Connection Conectar() throws ClassNotFoundException{
        Connection con = null;
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");            
            con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@168.138.146.58:1521:orcl","BDNOMTICKET","@Portafolio2021");
            if (con !=null){
                return con;
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("fallo la conexion error =" + e.getMessage());
        }
        return con;
    }    
}
