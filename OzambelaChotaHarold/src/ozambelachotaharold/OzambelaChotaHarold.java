package ozambelachotaharold;

import java.util.Scanner;

/**
 *
 * @author HAROLD
 */
public class OzambelaChotaHarold {

    /**
     * @param Harold
     */
    public static void main(String[] args) {
        CuentaCorriente cta1 = new CuentaCorriente(1500, "Juan perez");
        CuentaCorriente cta2 = new CuentaCorriente(1000, "Eva Vargas");
        transferencia(cta1, cta2);
    }
    public static void transferencia(CuentaCorriente ct1,CuentaCorriente ct2){
        double monto;
        String c1,c2;
        int opcion;
        
        c1=ct1.getNombreTitular();
        c2=ct2.getNombreTitular();       
        
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese monto a transferir: ");
        monto= input.nextDouble();
        System.out.println("[1] de "+c1+" a "+c2);
        System.out.println("[2] de "+c2+" a "+c1);
        System.out.println("ingrese opcion: ");
        opcion=input.nextInt();
        
        switch (opcion) {
            case 1:
                if(ct1.getSaldo()>monto){
                    ct1.retirar(monto);
                    ct2.depositar(monto);
                    System.out.println("saldo restante :"+ct1.getSaldo());
                }else{
                    System.out.println("Saldo insuficiente"+ct1.getSaldo());
                }
                break;
            case 2:
                if(ct2.getSaldo()>monto){
                   ct2.retirar(monto);
                   ct1.depositar(monto);
                   System.out.println("saldo restante: "+ct2.getSaldo());
                }else{
                    System.out.println("Saldo insuficiente" + ct2.getSaldo());
                }
             }
           System.out.println(ct1.toString());
           System.out.println(ct2.toString());
    }
    
}
