
package AgregarUsuario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CerrarSesion {
     private static final String FideMotorApp = "127.0.0.1";
     private static final int SERVER_PORT = 12345; 
     
       public static void main(String[] args) {
           try {
               Socket socket = new Socket(FideMotorApp, SERVER_PORT);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            System.out.println("Salir");
            String response = in.readLine();
             if (response.equals("Cierre de sesión confirmado")) {
                  System.out.println("¡Cierre de sesión exitoso!");
             }else{
                 System.out.println("Error: No se recibió confirmación del cierre de sesión.");
             }
              socket.close();
           } catch (Exception e) {
                e.printStackTrace();
           }
       }
    
}
