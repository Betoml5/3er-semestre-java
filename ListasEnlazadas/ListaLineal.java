public class ListaLineal {
    // Atributos
    private Nodo inicio;
    private int numNodos;

    // Constructor para crear una lista vacía
    public ListaLineal() {
        inicio = null;
        numNodos = 0;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
    }

    // get...
    public Nodo getInicio() {
        return inicio;
    }

    public int getNumNodos() {
        return numNodos;
    }

    // Método que devuelve true si la lista está vacía
    public boolean listaVacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }

    // Método que inserta un nodo al inicio de la lista
    public void insertaInicio(Nodo nuevo) {
        nuevo.setEnlace(inicio);
        inicio = nuevo;
        numNodos++;
    }

    // Método que recorre la lista y despliega en pantalla los datos de los nodos
    public void recorreLista() {
        Nodo r = inicio;
        System.out.print("Empieza la lista:\n");
        while (r != null) {
            System.out.print(r.toString() + "\n");
            r = r.getEnlace();
        }
        System.out.println("Fin de la lista");
    }

    @Override
    public String toString() {
        Nodo r = inicio;
        String s = "";
        while (r != null) {
            s += r.toString();
            r = r.getEnlace();
        }

        return s;
    }
    // faltan muchos más métodos
}