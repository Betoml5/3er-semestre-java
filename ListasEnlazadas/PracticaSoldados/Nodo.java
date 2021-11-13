public class Nodo {
    // Tres atributos: los 2 datos y el apuntador o enlace
    private String nombre;
    private Nodo enlace;

    // 1er. Constructor, crea un nodo con datos vacíos (NO recibe parámetros)
    public Nodo() {
        this.nombre = "";
        enlace = null;
    }

    // 2do. Constructor, recibe como parámetros los 2 datos, el enlace NO se recibe,
    // sino
    // que se pone en null porque este nuevo nodo está DESCONECTADO de la lista
    public Nodo(String nombre) {
        enlace = null;
        this.nombre = nombre;
    }

    // Métodos get...
    public String getNombre() {
        return nombre;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    // Métodos set...
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnlace(Nodo nuevoE) {
        enlace = nuevoE;
    }

    // Método toString
    public String toString() {
        return nombre + " ";
    }
}