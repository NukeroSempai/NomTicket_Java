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
    public String NroSerieVentas(){
        String serie="";
        String sql="select max(Num_Boleta) from BOLETA";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                serie=rs.getString(1);
            }
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
        } catch (Exception e){
            
        }
        return idv; //serie
    }
    public int GuardarVentas(Ventas v){
        Ventas ventas=new Ventas();
        String sql="insert into BOLETA(num_boleta,fecha_boleta,valor_total,valor_ticket,saldo_por_pagar,fk_codigo_ticket_id,fk_forma_pago_id,fk_rut_cajero_id) values(????????)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, v.getSerie());
            ps.setString(2, v.getFecha());
            ps.setInt(3, v.getTotal());
            ps.setInt(4, v.getTicket());
            ps.setInt(5, v.getSaldo());
            ps.setString(6, v.getCodticket());
            ps.setInt(7, v.getFormpago());
            ps.setInt(8, v.getCajero());
            r=ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return r;
    }
    public int GuardarDetalleTicket(DetalleTicket dt){
        String sql="insert into DETALLE_TICKET(id,cantidad,fk_codigo_producto_id,fk_num_ticket_id) values(????)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dt.getId());
            ps.setInt(2, dt.getCantidad());
            ps.setInt(3, dt.getCodigoProd());
            ps.setInt(4, dt.getNumTicket());
            ps.executeUpdate();
        } catch (Exception e) {
            
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
}

