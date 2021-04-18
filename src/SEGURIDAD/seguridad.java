package SEGURIDAD;

import CONEXION_BD.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

public class seguridad {

    Connection con;
    Conexion cn = new Conexion();
    CallableStatement st;
    PreparedStatement ps;
    ResultSet rs;

    private String generarHash(String clave) {
        String encriptado = "";

        try {
            con = cn.Conectar();
            st = con.prepareCall("{?=callEncoder(?)}");
            st.registerOutParameter(1, Types.VARCHAR);
            st.setString(2, clave);
            st.execute();
            encriptado = st.getString(1);
            con.close();
        } catch (Exception e) {
            System.out.println("error =" + e.getMessage());
        }
        return encriptado;
    }

    public boolean iniciarSesion(String nombre, String clave) {
        boolean autorizar = false;
        String usuarioRecuperado = "";
        String ClaveRecuperada = "";
        String ClaveProcesada = generarHash(clave);
        String sql = "select nombreusuario,password_emp from empleado where nombreusuario=?";
        //buscar y recuperar usuario y contraseña
        try {
            con = cn.Conectar();            
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next()){
                usuarioRecuperado = (rs.getString(1));
                ClaveRecuperada = (rs.getString(2));
            }      
            con.close();
        } catch (Exception e) {
            System.out.println("error en Seguridad ="+e.getMessage());
        }
        //comparar si son iguales
            System.out.println(nombre+"   "+ClaveProcesada);
        if ((nombre == usuarioRecuperado) == (ClaveRecuperada == ClaveProcesada)){            
            autorizar = true;
        }        
        return autorizar;
    }

}
