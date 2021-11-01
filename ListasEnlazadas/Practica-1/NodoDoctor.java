public class NodoDoctor {
    private Doctor doctor;
    private NodoDoctor enlace;

    public NodoDoctor(Doctor nuevoDoctor) {
        this.doctor = nuevoDoctor;
        this.enlace = null;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public NodoDoctor getEnlace() {
        return enlace;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setEnlace(NodoDoctor enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "El doctor " + getDoctor().getNombre() + " con la especialidad de " + getDoctor().getEspecialidad()
                + " tiene un sueldo de $" + getDoctor().getSueldo();
    }
}
