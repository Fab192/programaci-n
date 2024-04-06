
package Vehiculos;

/**
 *
 * @author Fabián
 */
public class Vehiculo {
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
