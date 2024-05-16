package paquete3;

import java.util.ArrayList;

public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public void establecerValorVenta(double n) {
        valorVenta = n;
    }

    public void establecerComputadoras(ArrayList<Computador> n) {
        computadoras = n;
    }

    public double obtenerValorVenta() {
        return valorVenta;
    }

    public ArrayList<Computador> establecerComputadora() {
        return computadoras;
    }

}
