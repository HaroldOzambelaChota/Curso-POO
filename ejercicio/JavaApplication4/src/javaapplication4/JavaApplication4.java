package javaapplication4;
public class JavaApplication4 {

    public static void main(String[] args) {
        CuentaCorriente cta1 = new CuentaCorriente(1500, "Juan perez");
        CuentaCorriente cta2 = new CuentaCorriente(1000, "Eva Vargas");
        
        System.out.println(cta1.toString());
        System.out.println(cta2.toString());
    }
    
}
