//Tabla Ticket
package modelo;


public class Ticket {
    
    int codigo; //Codigo ticket
    String fecha; //Fecha ticket
    String horaInicio; //Hora inicio Ticket vigencia
    String horaTermino; //Hora termino vigencia
    String estado;//Estado ticket
    int valor; //valor ticket
    String comentario; // Comentario o descripcion
    String rut; // rut empleado
    int tipo; // tipo ticket
    
    public Ticket(){
        
    }

    public Ticket(int codigo, String fecha, String horaInicio, String horaTermino, String estado, int valor, String comentario, String rut, int tipo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.estado = estado;
        this.valor = valor;
        this.comentario = comentario;
        this.rut = rut;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
