package paquete3;

public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerProcesador(Procesador n) {
        procesador = n;
    }

    public void establecerMemoria(Memoria n) {
        memoria = n;
    }

    public void calcularCostoCompu() {
        costoComputador = procesador.obtenerCosto() + memoria.obtenerCosto();
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public Procesador obtenerProcesador(){
        return procesador;
    }
    
    public Memoria obtenerMemoria(){
        return memoria;
    }
}
