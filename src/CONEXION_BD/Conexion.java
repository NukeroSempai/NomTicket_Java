
package CONEXION_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {
    
    public static Connection conectar() throws ClassNotFoundException{
        Connection con = null;
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Intentando conexion");
            con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@168.138.146.58:1521:orcl","BDNOMTICKET","@Portafolio2021");
            if (con !=null){
                System.out.println("Conectado con exito");
                Statement stmt =con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from AUTH_PERMISSION");
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) +" "+rs.getString(4));
                con.close();
            }
        }catch (SQLException e){
            System.out.println("fallo la conexion error =" + e.getMessage());           
            
        }
        return con;
    }
    
}
