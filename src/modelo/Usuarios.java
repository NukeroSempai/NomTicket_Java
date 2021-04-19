
package modelo;


public class Usuarios {
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private int rut;
    private String dv;
    private int telefono;
    private String password;
    private int comedor;
    private int comuna;
    
    
    public Usuarios() {
  
    }

    public Usuarios(int id, String nombre, String paterno, String materno, int rut, String dv, int telefono, String password,int comedor, int comuna) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.rut = rut;
        this.dv = dv;
        this.telefono = telefono;
        this.password = password;
        this.comedor = comedor;
        this.comuna = comuna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getComedor() {
        return comedor;
    }

    public void setComedor(int comedor) {
        this.comedor = comedor;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

   
    
}

