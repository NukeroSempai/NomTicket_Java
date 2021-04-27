package modelo;

import java.util.ArrayList;
import java.util.List;
import CONEXION_BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Nukero
 */
public class InformesDAO implements CRUD {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Informe> lista = new ArrayList<>();
        String sql = "select correlativo_inf,to_char(fecha_informe,'dd/MM/yyyy'),cant_boletas,cant_tickets,total_ventas,to_char(fecha_inicio,'dd/MM/yyyy'),to_char(fecha_termino,'dd/MM/yyyy') from informe_ticket order by correlativo_inf desc";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Informe inf = new Informe();
                inf.setCorrelativo(rs.getInt(1));
                inf.setFechaInforme(rs.getString(2));
                inf.setCantidadBoletas(rs.getInt(3));
                inf.setCantidadTicket(rs.getInt(4));
                inf.setTotalVenta(rs.getInt(5));
                inf.setFechaInicio(rs.getString(6));
                inf.setFechaTermino(rs.getString(7));
                lista.add(inf);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("error al listar productos " + e.getMessage());
        }
        return lista;
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
