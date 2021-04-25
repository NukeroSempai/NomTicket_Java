package modelo;

import java.util.ArrayList;
import java.util.List;
import CONEXION_BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
    public List listar(String fecha) {
        List<Informe> lista = new ArrayList<>();
        String sql = "select correlativo_inf,to_char(fecha_informe,'dd/MM/yyyy'),cant_boletas,cant_tickets,total_ventas,to_char(fecha_inicio,'dd/MM/yyyy'),to_char(fecha_termino,'dd/MM/yyyy') from informe_ticket where to_char(fecha_informe,'dd/MM/yyyy') = ? order by correlativo_inf desc";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha);
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
    
        public List listar(int codigo) {
        List<Informe> lista = new ArrayList<>();
        String sql = "select correlativo_inf,to_char(fecha_informe,'dd/MM/yyyy'),cant_boletas,cant_tickets,total_ventas,to_char(fecha_inicio,'dd/MM/yyyy'),to_char(fecha_termino,'dd/MM/yyyy') from informe_ticket where correlativo_inf = ? order by correlativo_inf desc";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
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
    
    public Object[] generarInforme(java.sql.Date fechaInicio,java.sql.Date fechaTermino){
        
        
        Object[] obj = new Object[3];
        String sql ="select  count(num_boleta),count(fk_codigo_ticket_id),nvl(sum(valor_total),0)from boleta where to_date(to_char(fecha_boleta,'dd/MM/yyyy')) BETWEEN to_date(to_char(?,'dd/MM/yyyy')) and to_date(to_char(?,'dd/MM/yyyy'))";
        try {
            System.out.println("conectando");
            con = cn.Conectar();
            System.out.println("preparando");
            ps = con.prepareStatement(sql);
            System.out.println("cambiando datos");
            //reparar error
            ps.setDate(1, fechaInicio);
            ps.setDate(2, fechaTermino);
            System.out.println("ejecutando query");
            rs = ps.executeQuery();
            System.out.println("inicio captura datos");
            while (rs.next()){
                obj[0] = rs.getInt(1);
                obj[1] = rs.getInt(2);
                obj[2] = rs.getInt(3);
            }
            System.out.println("termino captura datos");
        } catch (Exception e) {
            System.out.println("error al generar informe "+e.getMessage());
        }
        return obj;
        
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql ="insert into informe_ticket(correlativo_inf,fecha_informe,cant_boletas,cant_tickets,total_ventas,fecha_inicio,fecha_termino) values(ISEQ$$_77794.nextval,to_date(?),?,?,?,to_date(?),to_date(?))";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1,o[0]);//fecha informe
            ps.setObject(2,o[1]);//cantidad boletas
            ps.setObject(3,o[2]);//cantidad tickets
            ps.setObject(4, o[3]);//total_ventas
            ps.setObject(5, o[4]);//fecha inicio
            ps.setObject(6, o[5]);//fecha termino
            r=ps.executeUpdate();
            con.close();
            
        } catch (Exception e) {
            System.out.println("error al guardar informe "+e.getMessage());
        }
        return r;                
    }

    @Override
    public int actualizar(Object[] o) {
        //no es necesario programar esta funcionalidad pues los informes no son "actualizables" una ves generados
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(String id) {
        //no es necesario eliminar informes una vez estos han sido creados.
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
