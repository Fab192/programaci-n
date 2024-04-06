
package Vehiculos;


public class AplicacionInventarioVehiculos {
     public static void main(String[] args) {
         Vehiculo vehiculo1 = new Vehiculo("Toyota", "Camry", 2022);
        Vehiculo vehiculo2 = new Vehiculo("BMW", "Civic", 2021);
        Vehiculo vehiculo3 = new Vehiculo("Nissan", "Mustang", 2023);
        
          Inventario inventario = new Inventario();
          
         inventario.agregarVehiculo(vehiculo1);
        inventario.agregarVehiculo(vehiculo2);
        inventario.agregarVehiculo(vehiculo3);
        
         inventario.mostrarVehiculosDisponibles();
     }
    
}
