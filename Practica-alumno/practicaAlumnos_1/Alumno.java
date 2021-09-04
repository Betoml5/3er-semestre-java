package practicaAlumnos_1;

public class Alumno {
    private String nombre;
    private int grupo;
    private float calif1;
    private float calif2;

    public Alumno(String nombre, int grupo, float calif1, float calif2) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.calif1 = calif1;
        this.calif2 = calif2;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrupo() {
        return grupo;
    }

    public float getCalif1() {
        return calif1;
    }

    public float getCalif2() {
        return calif2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public void setCalif1(float calif1) {
        this.calif1 = calif1;
    }

    public void setCalif2(float calif2) {
        this.calif2 = calif2;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public float obtenerPromedio() {
        return (this.calif1 + this.calif2) / 2;
    }

}
