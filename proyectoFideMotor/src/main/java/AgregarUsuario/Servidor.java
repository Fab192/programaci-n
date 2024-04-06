
package AgregarUsuario;

import java.util.ArrayList;
import java.util.List;


public class Servidor {
    private List<Usuario> usuariosRegistrados;
    
    public Servidor(){
         usuariosRegistrados = new ArrayList<>();
    }
    public boolean agregarUsuario(Usuario usuario) {
     for (Usuario Usuario : usuariosRegistrados) {
         if (usuario.getIdentificacion().equals(usuario.getIdentificacion())) {
             System.out.println("Error: El usuario ya existe.");
                return false;
         }
     }
         usuariosRegistrados.add(usuario);
        System.out.println("Usuario agregado exitosamente.");
        return true;
       
}
}