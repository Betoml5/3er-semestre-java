import java.util.Set;

public class Equipo {
    private String nombre;
    private String categoria;
    private int puntos;

    public Equipo() {

    }

    public Equipo(String nombre, String categoria, int puntos) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.puntos = puntos;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
