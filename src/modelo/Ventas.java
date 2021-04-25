//TABLA BOLETA
package modelo;


public class Ventas {
    private int serie; //Número de boleta
    private String fecha; //Fecha boleta
    private int total; // Total compra
    private int ticket; // Valor Ticket
    private int saldo;// saldo por pagar
    private String codticket;//Número ticket
    private int formpago; // forma pago
    private int cajero;// rut cajero
    
    public Ventas() {
    
    }

    public Ventas(int serie, String fecha, int total, int ticket, int saldo, String codticket, int formpago, int cajero) {
        this.serie = serie;
        this.fecha = fecha;
        this.total = total;
        this.ticket = ticket;
        this.saldo = saldo;
        this.codticket = codticket;
        this.formpago = formpago;
        this.cajero = cajero;
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

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
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

    public int getCajero() {
        return cajero;
    }

    public void setCajero(int cajero) {
        this.cajero = cajero;
    }


    
  
}
