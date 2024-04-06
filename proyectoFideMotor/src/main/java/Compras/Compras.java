
package Compras;


public class Compras {
    private Vehiculo vehiculo;
    private String metodoPago;
    private String tipoDeTarjeta;
    private String numeroTarjeta;
    
    public Compras(Vehiculo vehiculo, String metodoPago){
        this.vehiculo= vehiculo;
        this.metodoPago=metodoPago;
    }
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public String getMrca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return año + " " + marca + " " + modelo;
    }

}
