
package modelo;


public class Empleado {
    private int codigo_emp;
    private String rut_emp;
    private String nom_emp;
    private String appaterno_emp;
    private String apmaterno_emp;
    private String clave;
    private String email;
    private int saldo;
    private int id_empresa;
    private int id_perfil;
    private int id_turno;
    
    public Empleado(){
    
    }

    public Empleado(int codigo_emp, String rut_emp, String nom_emp, String appaterno_emp, String apmaterno_emp, String clave, String email, int saldo, int id_empresa, int id_perfil, int id_turno) {
        this.codigo_emp = codigo_emp;
        this.rut_emp = rut_emp;
        this.nom_emp = nom_emp;
        this.appaterno_emp = appaterno_emp;
        this.apmaterno_emp = apmaterno_emp;
        this.clave = clave;
        this.email = email;
        this.saldo = saldo;
        this.id_empresa = id_empresa;
        this.id_perfil = id_perfil;
        this.id_turno = id_turno;
    }

    public int getCodigo_emp() {
        return codigo_emp;
    }

    public void setCodigo_emp(int codigo_emp) {
        this.codigo_emp = codigo_emp;
    }

    public String getRut_emp() {
        return rut_emp;
    }

    public void setRut_emp(String rut_emp) {
        this.rut_emp = rut_emp;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public String getAppaterno_emp() {
        return appaterno_emp;
    }

    public void setAppaterno_emp(String appaterno_emp) {
        this.appaterno_emp = appaterno_emp;
    }

    public String getApmaterno_emp() {
        return apmaterno_emp;
    }

    public void setApmaterno_emp(String apmaterno_emp) {
        this.apmaterno_emp = apmaterno_emp;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }
    
    
}
