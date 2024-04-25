
package Usuario;

import java.io.FileWriter;
import java.io.IOException;


public class Main {
     public static void main(String[] args){
         if (args.length == 0) {
            System.out.println("Debe proporcionar un argumento: 'usuario' o 'reserva'");
            return;
        }
         String command = args[0];
         switch (command) {
             case "usuario":
                  if (args.length != 4) {
                    System.out.println("Uso incorrecto. Debe proporcionar cédula, nombre y teléfono.");
                    return;
                }
                 agregarUsuario(args[1], args[2], args[3]);
                break;
            case "reserva": 
                 if (args.length != 8) {
                    System.out.println("Uso incorrecto. Debe proporcionar cédula, fecha, tipo de comida, guarnición 1, guarnición 2, proteína y ensalada.");
                    return;
                }
                   agregarReserva(args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
                break;
            default:
                System.out.println("Comando no reconocido.");
         }
     }

    private static synchronized  void agregarUsuario(String cedula, String nombre, String telefono) {
        try {
            FileWriter writer = new FileWriter("usuarios.txt", true);
            writer.write(cedula + "," + nombre + "," + telefono + "\n");
            writer.close();
            System.out.println("Usuario agregado correctamente.");
        } catch (Exception e) {
             System.out.println("Error al agregar usuario: " + e.getMessage());
        }
    }
     private static synchronized void agregarReserva(String cedula, String fecha, String tipoComida, String guarnicion1, String guarnicion2, String proteina, String ensalada){
         try {
              FileWriter writer = new FileWriter("reservas.txt", true);
          writer.write(cedula + "\n");
            writer.write("Fecha de comida: " + fecha + "\n");
            writer.write("Tipo de comida: " + tipoComida + "\n");
            writer.write("Guarnicion 1: " + guarnicion1 + "\n");
            writer.write("Guarnicion 2: " + guarnicion2 + "\n");
            writer.write("Proteína: " + proteina + "\n");
            writer.write("Ensalada: " + ensalada + "\n\n");
            writer.close();
            System.out.println("Reserva agregada correctamente.");
         } catch (Exception e) {
             System.out.println("Error al agregar reserva: " + e.getMessage());
         }
         
        
     }
    
}
