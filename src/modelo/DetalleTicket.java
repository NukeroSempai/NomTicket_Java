//Tabla Detalle Ticket
package modelo;


public class DetalleTicket {
    int id; //Número id
    int cantidad;// cantidad producto
    int codigoProd; // Código Producto
    int numTicket; // Numero Ticket
    
    public DetalleTicket(){
        
    }

    public DetalleTicket(int id, int cantidad, int codigoProd, int numTicket) {
        this.id = id;
        this.cantidad = cantidad;
        this.codigoProd = codigoProd;
        this.numTicket = numTicket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(int codigoProd) {
        this.codigoProd = codigoProd;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }
    
    
}
