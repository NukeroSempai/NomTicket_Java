
package CONEXION_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    public static Connection conectar() throws ClassNotFoundException{
        Connection con = null;
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@nomticketdb_high?TNS_ADMIN=//Wallet_NomTicketDB");
            if (con !=null){
                System.out.println("Conectado con exito");
            }
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"no se pudo conectar a la base de datos","Error", JOptionPane.ERROR_MESSAGE);
            
        }
        return con;
    }
    
}
