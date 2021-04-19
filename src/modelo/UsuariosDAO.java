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
        String sql = "select * from EMP_CASINO";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Usuarios p=new Usuarios();
                p.setId(rs.getInt("id_emp_casino"));
                p.setNombre(rs.getString("nom_emp_casino"));
                p.setPaterno(rs.getString("appat_emp_casino"));
                p.setMaterno(rs.getString("apmat_emp_casino"));
                p.setRut(rs.getInt("rut_emp_casino"));
                p.setDv(rs.getString("dv_rut_emp_casino"));
                p.setTelefono(rs.getInt("tel_emp_casino"));
                p.setNomUsuario(rs.getString("nombreusuario"));
                p.setPassword(rs.getString("password_emp_casino"));
                p.setComedor(rs.getInt("fk_comedor_id")); 
                p.setComuna(rs.getInt("fk_comuna_id"));
                lista.add(p);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("error al listar usuarios " + e.getMessage());
        }
        return lista;
    }

    public List listarComuna() {
        List<String> lista = new ArrayList<>();
        String sql = "select * from COMUNA order by id_comuna";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                String p=new String();
                p=(rs.getString("nombre"));
                lista.add(p);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("error al listar comunas " + e.getMessage());
        }
        return lista;
    }

    public List listarComedor() {
        List<String> lista = new ArrayList<>();
        String sql = "select * from COMEDOR order by id_comedor";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                String p=new String();
                p=(rs.getString("nom_comedor"));
                lista.add(p);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("error al listar comedor " + e.getMessage());
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql = "insert into emp_casino(id_emp_casino,nom_emp_casino,appat_emp_casino,apmat_emp_casino,rut_emp_casino,dv_rut_emp_casino,tel_emp_casino,nombreUsuario,password_emp_casino, fk_comedor_id, fk_comuna_id)values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
            ps.setObject(10, o[9]);
            ps.setObject(11,o[10]);
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
        String sql = "update emp_casino set nom_emp_casino=?,appat_emp_casino=?,apmat_emp_casino=?, rut_emp_casino=?, dv_rut_emp_casino=?, tel_emp_casino=?,fk_comedor_id,fk_comuna_id,password_emp_casino=?  where id_emp_casino=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
            ps.setObject(10, o[9]);            
            r=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return r;
    }

    @Override
    public int eliminar(int id) {
        int r = 0;
        String sql = "delete from emp_casino where id_emp_casino=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            r=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return r;
    } 

}
