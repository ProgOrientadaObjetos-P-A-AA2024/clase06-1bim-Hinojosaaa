package paquete3;

public class Memoria {
    private String marca;
    private double costo;
    
    public Memoria(String m, double c) {
        marca = m;
        costo = c;
    }
    
    public void establecerMarcaM(String n){
        marca = n;
    }
    
    public void establecerCostoM(double n){
        costo = n;
    }
    
    public String obtenerMarcaM(){
        return marca;
    }
    
    public double obtenerCostoM(){
        return costo;
    }
}
