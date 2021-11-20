public class ListaVagones {
    private NodoVagon inicio;
    private int numNodos;

    // Constructor para crear una lista vacía
    public ListaVagones() {
        inicio = null;
        numNodos = 0;
    }

    // get...
    public NodoVagon getInicio() {
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

    public void insertaInicio(NodoVagon nuevo) {

        NodoVagon r = inicio;
        boolean encontrado = false;

        while (r != null) {
            if (r.getCarga().equals(nuevo.getCarga())) {
                r.setPeso(r.getPeso() + 1);
                encontrado = true;
                break;
            }

            r = r.getEnlace();
        }

        if (!encontrado) {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
            numNodos++;
        }

    }

    public void insertaFinal(NodoVagon nuevo) {
        NodoVagon r = inicio;
        boolean isSame = false;

        while (r != null) {
            if (r.getCarga().equals(nuevo.getCarga())) {
                r.setPeso(r.getPeso() + nuevo.getPeso());
                isSame = true;
                System.out.println("--------------------------------------");
                System.out.println("Se aumento el peso de: " + r.getCarga());
                System.out.println("--------------------------------------");
                break;
            }

            r = r.getEnlace();
        }

        r = inicio;
        if (!isSame) {
            if (listaVacia())
                inicio = nuevo;
            else {
                while (r.getEnlace() != null) {
                    r = r.getEnlace();
                }
                r.setEnlace(nuevo);
            }
            numNodos++;
        }

    }

    public NodoVagon eliminaInicio() {
        if (!listaVacia()) {
            NodoVagon eliminado = inicio;
            System.out.println("Nodo desenganchado " + eliminado.toString());
            System.out.println("-------------------------");
            inicio = inicio.getEnlace();
            eliminado.setEnlace(null);
            numNodos--;
            return eliminado;
        }
        System.out.println("-----------------------------");
        System.out.println("No hay elementos en la lista");
        System.out.println("-----------------------------");
        return null;
    }

    // Método que recorre la lista y despliega en pantalla los datos de los nodos
    public void recorreLista() {
        NodoVagon r = inicio;
        if (!listaVacia()) {
            System.out.print("Empieza la lista:\n");
            while (r != null) {
                System.out.print(r.toString() + "\n");
                r = r.getEnlace();
            }
            System.out.println("Fin de la lista");
        } else {
            System.out.println("-----------------------------");
            System.out.println("No hay elementos en la lista");
            System.out.println("-----------------------------");
        }
    }

    // calcular promedio del dato 2 de los nodos

    // Metodo toString
    public String toString() {
        NodoVagon r = inicio;
        String s = "";
        while (r != null) {
            s += r.toString() + "\n";
            r = r.getEnlace(); // avanzar al sig. nodo
        }
        return s;
    }
}
