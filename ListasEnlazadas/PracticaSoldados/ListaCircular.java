public class ListaCircular {
    Nodo inicio;
    Nodo fin;
    int numNodos;

    public ListaCircular() {
        this.inicio = null;
        this.fin = null;
        this.numNodos = 0;
    }

    public ListaCircular(Nodo x) {
        this.inicio = x;
        this.fin = x;
        x.setEnlace(x);
        this.numNodos = 1;
    }

    public Nodo getFin() {
        return fin;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public int getNumNodos() {
        return numNodos;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
    }

    public void insertaInicio(Nodo nuevo) {
        if (listaVacia()) {
            inicio = fin = nuevo;
            nuevo.setEnlace(nuevo);
        } else {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
            fin.setEnlace(nuevo);
        }
        numNodos++;
    }

    public void insertaFinal(Nodo nuevo) {
        if (listaVacia()) {
            inicio = fin = nuevo;
            nuevo.setEnlace(nuevo);
        } else {
            fin.setEnlace(nuevo);
            nuevo.setEnlace(inicio);
            fin = nuevo;

        }
        numNodos++;
    }

    public boolean listaVacia() {
        if (numNodos == 0)
            return true;
        else
            return false;
    }

    public Nodo eliminar(Nodo nodoActual, Nodo nodoAnterior) {

        Nodo eliminado = inicio;
        if (!listaVacia()) {
            inicio = inicio.getEnlace();
            eliminado.setEnlace(null);
            numNodos--;
        }
        return eliminado;
    }

    public String toString() {
        Nodo r = inicio;
        String s = "";
        if (!listaVacia()) {
            for (int i = 0; i < numNodos; i++) {
                s += "Nombre del soldado: " + r.getNombre() + "\n";
                r = r.getEnlace();
            }
            return s;
        }
        return "No hay elementos en la lista";
    }
}
