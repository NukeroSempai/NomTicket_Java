package modelo;

import CONEXION_BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO implements CRUD {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Usuarios> lista = new ArrayList<>();
        String sql = "select rut_cajero,nombre,fk_sucursal_id,administrador,estado from CAJERO order by fk_sucursal_id";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Usuarios p=new Usuarios();
                p.setRut_cajero(rs.getString("rut_cajero"));
                p.setNombre(rs.getString("nombre"));                               
                p.setId_sucursal(rs.getInt("fk_sucursal_id"));
                p.setAdministrador(rs.getInt("administrador")); 
                p.setEstado(rs.getInt("estado"));
                lista.add(p);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("error al listar usuarios " + e.getMessage());
        }
        return lista;
    }
    
        public boolean VerificarSuperUsuario(String rut) {
        boolean admin = false;
        String sql = "select administrador from CAJERO where rut_cajero =?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, rut);
            rs=ps.executeQuery();
            while (rs.next()) {
                Usuarios p=new Usuarios();                
                p.setAdministrador(rs.getInt("administrador"));                 
                if(p.getAdministrador()==1){
                    admin = true;
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println("error al listar usuarios " + e.getMessage());
        }
        return admin;
    }

    public List listarSucursal() {
        List<String> lista = new ArrayList<>();
        String sql = "select * from SUCURSAL order by id_sucursal";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                String p=new String();
                p=(rs.getString("nombre_sucursal"));
                lista.add(p);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("error al listar sucursales " + e.getMessage());
        }
        return lista;
    }
    
    

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql = "insert into CAJERO(rut_cajero,nombre,clave,fk_sucursal_id,administrador,estado)values(?,?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);//rut
            ps.setObject(2, o[1]);//nombre
            ps.setObject(3, o[2]);//clave
            ps.setObject(4, o[3]);//sucursal
            ps.setObject(5, o[4]);//administrador
            ps.setObject(6, o[5]);//estado            
            r=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("error al agregar usuario " + e.getMessage());
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update CAJERO set rut_cajero=?,nombre=?,fk_sucursal_id=?,administrador=?,estado=?where rut_cajero=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);//rut
            ps.setObject(2, o[1]);//nombre            
            ps.setObject(3, o[2]);//sucursal
            ps.setObject(4, o[3]);//administrador
            ps.setObject(5, o[4]);//estado 
            ps.setObject(6,o[5]);// rut cajero a actualizar
            r=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("error al actualizar usuario "+e.getMessage());
        }
        return r;
    }
    
    public int actualizar(Object[] o,String clave) {
        int r=0;
        String sql = "update CAJERO set rut_cajero=?,nombre=?,clave=?,fk_sucursal_id=?,administrador=?,estado=?where rut_cajero=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);//rut
            ps.setObject(2, o[1]);//nombre
            ps.setObject(3, clave);//clave
            ps.setObject(4, o[2]);//sucursal
            ps.setObject(5, o[3]);//administrador
            ps.setObject(6, o[4]);//estado 
            ps.setObject(7,o[5]);// rut cajero a actualizar
            r=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("error al actualizar usuario "+e.getMessage());
        }
        return r;
    }

    
    public int eliminar(String rut) {
        
        int r = 0;
        String sql = "delete from CAJERO where rut_cajero=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, rut);
            r=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("error al eliminar cajero "+e.getMessage());
        }
        return r;
    } 

}
