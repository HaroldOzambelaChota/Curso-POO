package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numSucursal,prioridad;
        String dire, ciu,dni;
        int numPaquetes,refe;
        double peso;
        
        System.out.println("Ingrese datos de la sucursal");
        System.out.print("ingrese numero de la sucursal:");
        numSucursal =teclado.nextInt();
        teclado.nextLine();
        System.out.print("ingrese direccion:");
        dire = teclado.nextLine();
        System.out.print("ingrese ciudad:");
        ciu = teclado.nextLine();        
        Sucursal suc1 = new Sucursal(numSucursal, dire, ciu);
        System.out.print("Ingrese numero de paquetes:");
        numPaquetes = teclado.nextInt();
        Paquete paquetes[] = new Paquete[numPaquetes];        
        System.out.println("los datos de cada paquete:");
        for (int i = 0; i < numPaquetes; i++) {
            System.out.println("paquete :" + (i+1));
            System.out.print("ingrese referencia:");
            refe = teclado.nextInt();
            teclado.nextLine();
            System.out.println("ingrese dni:");
            dni = teclado.nextLine();
            System.out.print("ingrese peso:");
            peso = teclado.nextDouble();
            System.out.print("ingrese prioridad:");
            prioridad = teclado.nextInt();
            paquetes[i] = new Paquete(refe, peso, dni, prioridad);            
        }
        System.out.println("los datos de la sucursal");
        System.out.println("Sucursal :" + suc1.getNumeroSucursal());
        System.out.println("Situada en :" + suc1.getDireccion() + " de la ciudad de:" + suc1.getCiudad());
        System.out.println("los datos de los paquetes:");
        for (int i = 0; i < numPaquetes; i++) {
            System.out.println("Paquete :" + (i+1));
            System.out.println("Precio: " + suc1.calcularPrecio(paquetes[i]));
            System.out.println("Peso :" + paquetes[i].getPeso());            
        }        
    }    
}
