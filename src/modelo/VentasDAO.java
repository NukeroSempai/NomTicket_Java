package modelo;

import CONEXION_BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentasDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    //Numero de pedido boleta
    public int NroSerieVentas(){
        int serie=0;
        String sql="select max(Num_Boleta) from BOLETA";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                serie=rs.getInt(1);
            }
            con.close();
        }catch (Exception e){
            
        }
        return serie;
    }
    
    public String Num_Boleta(){
        String idv="";//serie
        String sql="select max(num_boleta) from boleta";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                idv=rs.getString(1);//serie
            }
            con.close();
        } catch (Exception e){
            
        }
        return idv; //serie
    }
    public int GuardarVentas(Ventas v){        
        int r =0;
        String sql="insert into BOLETA(num_boleta,fecha_boleta,valor_total,valor_ticket,saldo_por_pagar,fk_codigo_ticket_id,fk_forma_pago_id,fk_rut_cajero_id,hora_venta) values(?,sysdate,?,?,?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, v.getSerie());            
            ps.setInt(2, v.getTotal());
            ps.setInt(3, v.getV_Ticket());
            ps.setInt(4, v.getSaldo());
            ps.setString(5, v.getCodticket());
            ps.setInt(6, v.getFormpago());
            ps.setString(7, v.getCajero());
            ps.setString(8, v.getHora_venta());
            r=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("error al guardar boleta"+e.getMessage());
        }
        return r;
    }
    public int GuardarDetalleVenta(DetalleTicket dt){
        int r = 0;
        String sql="insert into DETALLE_BOLETA(id,cantidad,fk_codigo_producto_id,fk_num_boleta_id) values(iseq$$_78573.nextval,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);            
            ps.setInt(1, dt.getCantidad());
            ps.setInt(2, dt.getCodigoProd());
            ps.setInt(3, dt.getNumTicket());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("error al guardar detalle "+e.getMessage());
        }
        return r;
    }
    
     public List listarFormpago() {
         
       List<String> lista =new ArrayList<>();
       String sql="select * from FORMAS_PAGO order by id_forma_pago";
       try {
           con=cn.Conectar();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();           
           while (rs.next()) {
               String p=new String();
               p=(rs.getString("nombre_forma_pago"));                             
               lista.add(p);               
           }
           con.close();
           
       } catch (Exception e) {
           System.out.println("error al listar Tipos de productos "+e.getMessage());
       } 
       return lista;
     }
     /*
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
    public int eliminar(String id) {
        int r = 0;
        String sql="delete from producto where codigo_producto=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(id));
            r=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return r;
    }       */
}

