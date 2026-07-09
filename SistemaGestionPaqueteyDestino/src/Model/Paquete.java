package model;

public class Paquete {

    private String codigo;
    private String destinatario;
    private double precio;
    private String destino;

    public Paquete(String codigo, String destinatario, double precio, String destino){
        setCodigo(codigo);
        setDestinatario(destinatario);
        setPrecio(precio);
        setDestino(destino);
    }

    public String getCodigo() {
        return codigo;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public double getPrecio() {
        return precio;
    }
    public String getDestino() {
        return destino;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

}
