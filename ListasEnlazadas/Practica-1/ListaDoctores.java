
public class ListaDoctores {
    private NodoDoctor inicio;
    private int numNodos;

    // Constructor para crear una lista vac�a
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

    public void setInicio(NodoDoctor inicio) {
        this.inicio = inicio;
    }

    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
    }

    // M�todo que devuelve true si la lista est� vac�a
    public boolean listaVacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }

    // M�todo que inserta un nodo al inicio de la lista
    public void insertaInicio(NodoDoctor nuevo) {
        nuevo.setEnlace(inicio);
        inicio = nuevo;
        numNodos++;
    }

    // M�todo que inserta un nodo al final de la lista
    public void insertaFinal(NodoDoctor x) {
        NodoDoctor r = inicio;
        if (listaVacia())
            inicio = x;
        else {
            while (r.getEnlace() != null) {
                r = r.getEnlace();
            }
            r.setEnlace(x);
        }
        numNodos++;
    }

    public NodoDoctor eliminaInicio() {
        NodoDoctor eliminado = inicio;
        if (!listaVacia()) {
            inicio = inicio.getEnlace();
            eliminado.setEnlace(null);
            numNodos--;
        }
        return eliminado;
    }

    // M�todo que recorre la lista y despliega en pantalla los datos de los nodos
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

    public String medicoEspecialidad(String esp) {

        NodoDoctor r = inicio;
        String s = "Especialidad: " + esp + "\n";
        while (r != null) {
            if (r.getDoctor().getEspecialidad().equals(esp)) {
                s += r.getDoctor().getNombre() + "\n";
            }
            r = r.getEnlace(); // avanzar al sig. nodo
        }
        return s;
    }

    public float sumaSueldos() {
        NodoDoctor r = inicio;
        float sumaTotal = 0;
        if (!listaVacia()) {
            while (r != null) {
                sumaTotal += r.getDoctor().getSueldo();
                r = r.getEnlace();
            }

            return sumaTotal;
        }

        return sumaTotal;
    }

    public NodoDoctor eliminarPorNombre(String nombre) {
        NodoDoctor nodoActual = inicio;
        NodoDoctor nodoAtras = null;
        if (!listaVacia()) {
            if (numNodos == 1 && nodoActual.getDoctor().getNombre().equals(nombre)) {
                System.out.println("El doctor " + nodoActual.getDoctor().getNombre() + " ha sido eliminado");
                return nodoActual = eliminaInicio();
            }
            if (nodoActual.getDoctor().getNombre().equals(nombre)) {
                nodoAtras = inicio;
                nodoActual = inicio.getEnlace();
                NodoDoctor aux = nodoActual;
                inicio = null;
                numNodos--;
                System.out.println("El doctor " + aux.getDoctor().getNombre() + " ha sido eliminado");
                return aux;
            }
            nodoAtras = inicio;
            nodoActual = inicio.getEnlace();
            while (nodoActual != null) {
                if (nodoActual.getDoctor().getNombre().equals(nombre)) {
                    NodoDoctor aux = nodoActual;
                    nodoActual = null;
                    nodoAtras.setEnlace(aux.getEnlace());
                    numNodos--;
                    System.out.println("El doctor " + aux.getDoctor().getNombre() + " ha sido eliminado");
                    return aux;
                }
                // Avanzamos en caso de que no se cumpla la condicion.
                nodoAtras = nodoAtras.getEnlace();
                nodoActual = nodoActual.getEnlace();

            }
        }
        System.out.println("No hemos encontrado ningun doctor con ese nombre");
        return null;
    }

    public void insertaAlfabetico(NodoDoctor nuevo) {
        NodoDoctor nodoActual = inicio;
        NodoDoctor nodoAtras = null;
        if (!listaVacia()) {
            if (nuevo.getDoctor().getNombre().compareToIgnoreCase(nodoActual.getDoctor().getNombre()) < 0) {
                insertaInicio(nuevo);
                return;
            }
            nodoAtras = inicio;
            nodoActual = inicio.getEnlace();

            while (nodoActual != null) {
                if (nuevo.getDoctor().getNombre().compareToIgnoreCase(nodoActual.getDoctor().getNombre()) < 0) {
                    nodoAtras.setEnlace(nuevo);
                    nuevo.setEnlace(nodoActual);
                    numNodos++;
                    return;
                }
                // Avanzamos en caso de que no se cumpla la condicion.
                nodoAtras = nodoAtras.getEnlace();
                nodoActual = nodoActual.getEnlace();
            }
            insertaFinal(nuevo);
        } else {
            insertaInicio(nuevo);
        }

    }

    // Metodo toString
    public String toString() {
        NodoDoctor r = inicio;
        String s = "";
        if (!listaVacia()) {
            while (r != null) {
                s += r.toString() + "\n";
                r = r.getEnlace(); // avanzar al sig. nodo
            }
            return s;
        }
        return "No hay elementos en la lista";
    }

}
