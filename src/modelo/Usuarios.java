
package modelo;


public class Usuarios {
    private String rut_cajero;
    private String nombre;
    private String clave;    
    private int id_sucursal;
    private int administrador;
    private int estado;

    public Usuarios() {
    }

    public Usuarios(String rut_cajero, String nombre, String clave, int id_sucursal, int administrador, int estado) {
        this.rut_cajero = rut_cajero;
        this.nombre = nombre;
        this.clave = clave;
        this.id_sucursal = id_sucursal;
        this.administrador = administrador;
        this.estado = estado;
    }

    public String getRut_cajero() {
        return rut_cajero;
    }

    public void setRut_cajero(String rut_cajero) {
        this.rut_cajero = rut_cajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}