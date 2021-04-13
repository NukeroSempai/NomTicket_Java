
package modelo;

import CONEXION_BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
       List<Producto> lista =new ArrayList<>();
       String sql="select * from PRODUCTO";
       try {
           con=cn.Conectar();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();           
           while (rs.next()) {               
               System.out.println(rs.getString("nom_prod"));
                         
               Producto p=new Producto();
               p.setCodigo(rs.getInt("cod_prod"));
               p.setNombre(rs.getString("nom_prod"));
               p.setDescripcion(rs.getString("des_prod"));
               p.setPrecio(rs.getInt("precio_prod"));
               p.setTipo(rs.getInt("fk_tipo_producto_id"));
               lista.add(p);               
           }
           con.close();
           
       } catch (Exception e) {
           System.out.println("error al listar productos "+e.getMessage());
       } 
       return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into producto(cod_prod, nom_prod,des_prod,fk_tipo_producto_id,precio_prod)values(?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("error al agregar productos "+e.getMessage());
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
       String sql="update producto set cod_prod=?, nom_prod=?,des_prod=?,fk_tipo_producto_id=?, precio_prod=? where cod_prod=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
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
        String sql="delete from producto where cod_prod=?";
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
