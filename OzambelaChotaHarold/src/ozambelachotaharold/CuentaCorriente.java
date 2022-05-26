/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ozambelachotaharold;

/**
 *
 * @author HAROLD
 */
public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente() {
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
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
