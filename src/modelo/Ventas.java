//TABLA BOLETA
package modelo;


public class Ventas {
    private int serie; //Número de boleta
    private String fecha; //Fecha boleta
    private int total; // Total compra
    private int v_ticket; // Valor Ticket
    private int saldo;// saldo por pagar
    private String codticket;//Número ticket
    private int formpago; // forma pago
    private String cajero;// rut cajero
    private String hora_venta;

    
    
    public Ventas() {
    
    }

    public Ventas(int serie, String fecha, int total, int v_ticket, int saldo, String codticket, int formpago, String cajero,String hora_venta) {
        this.serie = serie;
        this.fecha = fecha;
        this.total = total;
        this.v_ticket = v_ticket;
        this.saldo = saldo;
        this.codticket = codticket;
        this.formpago = formpago;
        this.cajero = cajero;
        this.hora_venta = hora_venta;
    }
    
    public String getHora_venta() {
        return hora_venta;
    }

    public void setHora_venta(String hora_venta) {
        this.hora_venta = hora_venta;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getV_Ticket() {
        return v_ticket;
    }

    public void setV_Ticket(int ticket) {
        this.v_ticket = ticket;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getCodticket() {
        return codticket;
    }

    public void setCodticket(String codticket) {
        this.codticket = codticket;
    }

    public int getFormpago() {
        return formpago;
    }

    public void setFormpago(int formpago) {
        this.formpago = formpago;
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }


    
  
}
