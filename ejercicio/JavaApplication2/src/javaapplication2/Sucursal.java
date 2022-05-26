package javaapplication2;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal() {
    }

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public double calcularPrecio(Paquete obj){
        double precio;
        precio = obj.getPeso();
        if(obj.getPrioridad()==1) precio+=10;
        if(obj.getPrioridad()==2) precio+=20;
        return precio;
    }
}
