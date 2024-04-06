
package AgregarUsuario;


public class Main {
    public static void main(String[] args) {
         Servidor servidor = new Servidor();
         Usuario nuevoUsuario = new Usuario("Diego", "Guzman", "123456789", "555-1234567",
                "contraseña111", "Calle 123", "Masculino", "01/01/1987");
          servidor.agregarUsuario(nuevoUsuario);
    }
    
}
