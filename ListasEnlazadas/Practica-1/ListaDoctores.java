public class ListaDoctores {
    private NodoDoctor inicio;
    private int numNodos;

    // Constructor para crear una lista vacía
    public ListaDoctores() {
        inicio = null;
        numNodos = 0;
    }

    // get...
    public NodoDoctor getInicio() {
        return inicio;
    }

    public int getNumNodos() {
        return numNodos;
    }

    // faltan los set..

    // Método que devuelve true si la lista está vacía
    public boolean listaVacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }

    // Método que inserta un nodo al inicio de la lista
    public void insertaInicio(NodoDoctor nuevo) {
        nuevo.setEnlace(inicio);
        inicio = nuevo;
        numNodos++;
    }

    // Método que recorre la lista y despliega en pantalla los datos de los nodos
    public void recorreLista() {
        NodoDoctor r = inicio;
        System.out.print("Empieza la lista:\n");
        while (r != null) {
            System.out.print(r.toString() + "\n");
            r = r.getEnlace();
        }
        System.out.println("Fin de la lista");
    }

    public String buscarDoctor(String nombre) {
        NodoDoctor r = inicio;
        if (!listaVacia()) {
            while (r != null) {
                if (r.getDoctor().getNombre().equals(nombre)) {
                    return r.getDoctor().toString();
                }
                r = r.getEnlace();
            }
            return "No se encontro ningun doctor con ese nombre";

        } else {
            return "La lista esta vacia";
        }
    }

    // Metodo toString
    public String toString() {
        NodoDoctor r = inicio;
        String s = "";
        while (r != null) {
            s += r.toString() + "\n";
            r = r.getEnlace(); // avanzar al sig. nodo
        }
        return s;
    }

}
