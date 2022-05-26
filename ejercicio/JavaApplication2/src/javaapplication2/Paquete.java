package javaapplication2;
public class Paquete {
    private int referencia;
    private double peso;
    private String dni;
    private int prioridad;

    public Paquete() {
    }
    public Paquete(int referencia, double peso, String dni, int prioridad) {
        this.referencia = referencia;
        this.peso = peso;
        this.dni = dni;
        this.prioridad = prioridad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
}
