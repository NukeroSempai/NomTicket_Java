
package modelo;


/**
 *
 * @author Nukero
 */
public class Informe {
    
    private int correlativo;
    private String fechaInforme;
    private int cantidadBoletas;
    private int cantidadTicket;
    private int totalVenta;
    private String fechaInicio;
    private String fechaTermino;

    public Informe() {
    }

    public Informe(int correlativo, String fechaInforme, int cantidadBoletas, int cantidadTicket, int totalVenta, String fechaInicio, String fechaTermino) {
        this.correlativo = correlativo;
        this.fechaInforme = fechaInforme;
        this.cantidadBoletas = cantidadBoletas;
        this.cantidadTicket = cantidadTicket;
        this.totalVenta = totalVenta;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public String getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(String fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public int getCantidadBoletas() {
        return cantidadBoletas;
    }

    public void setCantidadBoletas(int cantidadBoletas) {
        this.cantidadBoletas = cantidadBoletas;
    }

    public int getCantidadTicket() {
        return cantidadTicket;
    }

    public void setCantidadTicket(int cantidadTicket) {
        this.cantidadTicket = cantidadTicket;
    }

    public int getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    
}
