
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
//Listar producto en la ventana VentaForm
    public Producto listarCodigo(int codigo){
        Producto p=new Producto();
        String sql="select * from PRODUCTO where codigo_producto=?";
        try {
         con=cn.Conectar();   
         ps=con.prepareStatement(sql);
         ps.setInt(1, codigo);
         rs=ps.executeQuery();
         while (rs.next()) {
             p.setCodigo(rs.getInt(1));
             p.setNombre(rs.getString(2));
             p.setDescripcion(rs.getString(3));
             p.setPrecio(rs.getInt(4));
             p.setTipo(rs.getInt(5));
         }
        } catch (Exception e) {
            
        }
        return p;
    }
    
//Metodos mantenimiento CRUD
    @Override
    public List listar() {
       List<Producto> lista =new ArrayList<>();
       String sql="select * from PRODUCTO";
       try {
           con=cn.Conectar();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();           
           while (rs.next()) {
               Producto p=new Producto();
               p.setCodigo(rs.getInt("codigo_producto"));
               p.setNombre(rs.getString("nom_producto"));
               p.setDescripcion(rs.getString("descripcion"));
               p.setTipo(rs.getInt("fk_tipo_producto_id"));
               p.setPrecio(rs.getInt("precio"));               
               lista.add(p);               
           }
           con.close();
           
       } catch (Exception e) {
           System.out.println("error al listar productos "+e.getMessage());
       } 
       return lista;
    }
    
        public List listarTipo() {
       List<String> lista =new ArrayList<>();
       String sql="select * from TIPO_PRODUCTO order by id_tipo_producto";
       try {
           con=cn.Conectar();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();           
           while (rs.next()) {
               String p=new String();
               p=(rs.getString("nom_tipo_producto"));                             
               lista.add(p);               
           }
           con.close();
           
       } catch (Exception e) {
           System.out.println("error al listar Tipos de productos "+e.getMessage());
       } 
       return lista;
    }
    
    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into producto(codigo_producto, nom_producto,descripcion,fk_tipo_producto_id,precio)values(?,?,?,?,?)";
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
       String sql="update producto set codigo_producto=?, nom_producto=?,descripcion=?,fk_tipo_producto_id=?, precio=? where codigo_producto=?";
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
        String sql="delete from producto where codigo_producto=?";
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
