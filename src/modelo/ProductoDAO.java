
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ProductoDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
       List<Producto> lista =new ArrayList<>();
       String sql="select * from producto";
       try {
           con=cn.Conectar();
           ps=con.prepareStatement (sql);
           rs=ps.executeQuery();
           while (rs.next()) {
               Producto p=new Producto();
               p.setCod(rs.getInt(1));
               p.setNom(rs.getString(2));
               p.setDesc(rs.getString(3)); //falta agregar el campo foto. pero no se si definirlo como objeto u otro elemento
               p.setPrecio(rs.getInt(4));
               lista.add(p);
           }
           
       } catch (Exception e) {
       } 
       return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into producto(cod_prod, nom_prod,desc_prod, foto_prod,precio_prod)values(?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);//falta agregar el campo foto. pero no se si definirlo como objeto u otro elemento
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
       String sql="update producto set cod_prod=?, nom_prod=?,desc_prod=?,foto_prod=?, precio_prod=? where cod_prod=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);//falta agregar el campo foto. pero no se si definirlo como objeto u otro elemento
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql="delete from producto where cod_prod=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
