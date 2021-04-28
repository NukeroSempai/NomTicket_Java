    package modelo;

import CONEXION_BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TicketDAO implements CRUD{

    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Ticket t=new Ticket();

    public Ticket listarCodigo(String codigo) {
        Ticket t=new Ticket();

        String sql = "select * from TICKET where codigo_ticket=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs=ps.executeQuery();
            while (rs.next()) {
                t.setCodigo(rs.getInt(1));
                t.setFecha(rs.getString(2));
                t.setHoraInicio(rs.getString(3));
                t.setHoraTermino(rs.getString(4));
                t.setEstado(rs.getString(5));
                t.setValor(rs.getInt(6));
                t.setComentario(rs.getString(7));
                t.setRut(rs.getString(8));
                t.setTipo(rs.getInt(9));
            }
        } catch (Exception e) {
        }
        return t;
    }
    
    public List recuperarPedido(String codigo){
       
        List <DetalleTicket> lista = new ArrayList<>();
        String sql ="select fk_codigo_producto_id,cantidad from pedido_ticket where fk_num_ticket_id = ?";
        try {
            con = cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs=ps.executeQuery();
            while (rs.next()) {
                DetalleTicket dt = new DetalleTicket();
                dt.setCodigoProd(rs.getInt(1));
                dt.setCantidad(rs.getInt(2));
                lista.add(dt);                
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    
//Metodos mantenimiento CRUD
  

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int add(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
  