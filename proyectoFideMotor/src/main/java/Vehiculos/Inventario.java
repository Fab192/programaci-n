
package Vehiculos;

import java.util.ArrayList;
import java.util.List;


public class Inventario {
     private List<Vehiculo> vehiculo;
     public Inventario() {
          vehiculo = new ArrayList<>();
     }
       public void agregarVehiculo(Vehiculo vehiculo) {
            vehiculo.equals(vehiculo);
    
}
       public void mostrarVehiculosDisponibles(){
           if (vehiculo.isEmpty()) {
               System.out.println("No hay vehículos disponibles en este momento.");
           }else{
                System.out.println("Vehículos disponibles para la venta:");
                 for (Vehiculo vehiculos : vehiculo) {
                     System.out.println(vehiculo);
                 }
           }
       }
       public int obtenerRecuentoDeVehículosFisponibles() {
           return vehiculo.size();
       }
}