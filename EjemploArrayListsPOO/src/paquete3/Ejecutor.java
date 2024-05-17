package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        ArrayList<Computador> PCs = new ArrayList<>();
        
        int pc;
        String marcaPC, marcaP, marcaM;
        double costoP, costoM;
        
        System.out.println("Ingrese numero de computadoras a comprar: ");
        pc = sc.nextInt();
        
        for (int i = 0; i < pc; i++) {
            
            System.out.print(" Marca De La PC:      ");
            marcaPC = sc.nextLine();
            
            sc.nextLine();
            
            System.out.print(" Marca Del Procesador:     ");
            marcaP = sc.nextLine();
            
            System.out.print(" Costo Del Procesador:     ");
            costoP = sc.nextDouble();
            
            sc.nextLine();
            Procesador proc = new Procesador(marcaP, costoP);
            
            System.out.print(" Marca De La Memoria:     ");
            marcaM = sc.nextLine();
            
            System.out.print(" Costo De La Memoria:     ");
            costoM = sc.nextDouble();
            
            Memoria memo = new Memoria(marcaM, costoM);
            
            Computador compu = new Computador(marcaPC, proc, memo);
            compu.obtenerCostoComputador();
            PCs.add(compu);
            
            sc.nextLine();
        }
        
        Venta venta = new Venta();
        venta.establecerComputadoras(PCs);
        venta.calcularValorVenta();
        
        System.out.printf(" %s\n ", venta);
        

    }
    
}
