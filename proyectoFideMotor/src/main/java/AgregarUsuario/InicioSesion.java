
package AgregarUsuario;

public class InicioSesion {
     private static boolean autenticarUsuario(String identificación, String contraseña) {
          return identificación.equals("identificación") && contraseña.equals("contraseña");
          
     }
      public static void main(String[] args) {
             if (args.length < 2) {
                  System.out.println("Uso: java InicioSesion <identificación> <contraseña>");
            return;
             }
             String identificación= "123456789";
             String contraseña= "1111111";
              System.out.println("Autenticando usuario...");
              
                if (!autenticarUsuario(identificación, contraseña)) {
                     System.out.println("Error: Credenciales incorrectas.");
            return;
                }
         String usuario = null;
                  System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + usuario + "!");
                   int opcion;
                    do {
                    System.out.println("\nOpciones disponibles:");
                    System.out.println("1. Visualizar vehículos");
                    System.out.println("2. Editar datos");
                    System.out.println("3. Visualizar compras realizadas");
                    System.out.println("4. Salir de la sesión");
                     opcion = 4;
                     switch (opcion) {
                         case 1:
                    System.out.println("Mostrando vehículos...");
                    // Lógica para mostrar vehículos
                    break;
                case 2:
                    System.out.println("Editando datos...");
                    // Lógica para editar datos
                    break;
                case 3:
                    System.out.println("Visualizando compras realizadas...");
                    // Lógica para visualizar compras realizadas
                    break;
                case 4:
                    System.out.println("Saliendo de la sesión...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                     }
                    }while (opcion != 4);
                    System.out.println("¡Gracias por usar nuestro sistema! Hasta luego.");
      }
    
}
