package model;

public class Paquete {

    private String codigo;
    private String destinatario;
    private double peso;
    private Destino destino;

    public Paquete(String codigo, String destinatario, double peso, Destino destino){
        setCodigo(codigo);
        setDestinatario(destinatario);
        setPeso(peso);
        setDestino(destino);
    }

    public String getCodigo() {
        return codigo;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public double getPeso() {
        return peso;
    }
    public Destino getDestino() {
        return destino;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setDestino(Destino destino) {
        this.destino = destino;
    }

}
