
package modelo;

public class Producto {
    int cod;
    String nom;
    String desc;
    //foto;
    int precio;
    
    public Producto() {
    }

    public Producto(int cod, String nom, String desc, int precio) {
        this.cod = cod;
        this.nom = nom;
        this.desc = desc;
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
    
