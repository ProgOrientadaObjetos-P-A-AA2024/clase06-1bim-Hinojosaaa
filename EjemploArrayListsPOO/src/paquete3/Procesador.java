package paquete3;

public class Procesador {
    private String marca;
    private double costo;
    
    public Procesador(String m, double c) { 
        marca = m;
        costo = c;
    }
    
    public void establecerMarcaP(String n){
        marca = n;
    }
    
    public void establecerCostoP(double n){
        costo = n;
    }
    
    public String obtenerMarcaP(){
        return marca;
    }
    
    public double obtenerCostoP(){
        return costo;
    }
    
}
