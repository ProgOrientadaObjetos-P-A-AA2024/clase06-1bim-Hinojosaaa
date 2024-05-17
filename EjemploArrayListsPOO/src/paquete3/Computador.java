package paquete3;

public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;
    
   public Computador(String n, Procesador p, Memoria m) {
       marca = n;
       procesador = p;
       memoria = m;
       calcularCostoCompu();
   }
    
    public void establecerMarcaPC(String n) {
        marca = n;
    }

    public void establecerProcesador(Procesador n) {
        procesador = n;
    }

    public void establecerMemoria(Memoria n) {
        memoria = n;
    }

    public void calcularCostoCompu() {
        costoComputador = procesador.obtenerCostoP() + memoria.obtenerCostoM();
    }
    
    public String obtenerMarcaPC(){
        return marca;
    }
    
    public Procesador obtenerProcesador(){
        return procesador;
    }
    
    public Memoria obtenerMemoria(){
        return memoria;
    }
    
    public double obtenerCostoComputador(){
        return costoComputador;
    }
}
