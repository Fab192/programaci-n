
package Usuario;

import java.io.FileWriter;


public class reserva extends Thread {
    private String cedula;
    private String fecha;
    private String tipoComida;
    private String guarnicion1;
    private String guarnicion2;
    private String Proteina;
    private String ensalada;

    public reserva(String cedula, String fecha, String tipoComida, String guarnicion1, String guarnicion2, String Proteina, String ensalada) {
        this.cedula = cedula;
        this.fecha = fecha;
        this.tipoComida = tipoComida;
        this.guarnicion1 = guarnicion1;
        this.guarnicion2 = guarnicion2;
        this.Proteina = Proteina;
        this.ensalada = ensalada;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getGuarnicion1() {
        return guarnicion1;
    }

    public void setGuarnicion1(String guarnicion1) {
        this.guarnicion1 = guarnicion1;
    }

    public String getGuarnicion2() {
        return guarnicion2;
    }

    public void setGuarnicion2(String guarnicion2) {
        this.guarnicion2 = guarnicion2;
    }

    public String getProteina() {
        return Proteina;
    }

    public void setProteina(String Proteina) {
        this.Proteina = Proteina;
    }

    public String getEnsalada() {
        return ensalada;
    }

    public void setEnsalada(String ensalada) {
        this.ensalada = ensalada;
    }
     
    
    
}
