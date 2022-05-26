package javaapplication4;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        numeroCuenta = (long) (Math.random()*100);        
    }
    
    public void depositar(double monto){
        if(monto<0)
            System.out.println("no se permite montos negativos");
        else
            saldo+=monto;
    }
    public void retirar(double monto){
        saldo-=monto;        
    }

    @Override
    public String toString() {
        return "saldo=" + saldo + ", nombreTitular=" + nombreTitular +
                ", numeroCuenta=" + numeroCuenta;
    }
    
    
    
    
}
