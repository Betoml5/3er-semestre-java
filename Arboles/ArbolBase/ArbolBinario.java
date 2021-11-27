// Clase instanciable para manejar un árbol binario ordenado

public class ArbolBinario {

    // Atributo (solo la raíz del árbol)
    private NodoArbolBin raiz;

    // Constructor (crea un árbol binario vacío)
    public ArbolBinario() {
        raiz = null;
    }

    // 1 get
    public NodoArbolBin getRaiz() {
        return raiz;
    }

    // 1 set
    public void setRaiz(NodoArbolBin nuevaRaiz) {
        raiz = nuevaRaiz;
    }

    // Método para determinar si el árbol vacío
    public boolean estaVacio() {
        if (raiz == null)
            return true;
        else
            return false;
    }

    // Método PRINCIPAL para insertar un nodo en el árbol
    public void insertarNodo(NodoArbolBin n) {
        if (estaVacio()) // si el arbol esta vacio, crea la raiz con este nodo nuevo
            raiz = n;
        else
            insertar(raiz, n); // si ya tiene nodos, busca dónde insertarlo usando un método auxiliar
    }

    // Método AUXILIAR para insertar RECURSIVO agrega < a la izquierda y >= a la
    // derecha
    public void insertar(NodoArbolBin raiz, NodoArbolBin n) {
        if (raiz.getDato().compareToIgnoreCase(n.getDato()) >= 0) {
            if (raiz.getIzquierdo() == null)
                raiz.setIzquierdo(n); // en esta posición inserta un nuevo nodo
            else // cuando ya tiene hijo izquierdo ese nodo, y no lo puede colgar
                insertar(raiz.getIzquierdo(), n); // se manda llamar a sí mismo para buscar lugar libre
        } else {
            if (raiz.getDerecho() == null)
                raiz.setDerecho(n); // en esta posición inserta un nuevo nodo
            else
                insertar(raiz.getDerecho(), n); // se manda llamar a sí mismo para buscar espacio libre
        }

    }

    // devuelve un String con el recorrido PREORDEN del árbol
    public String preorden(NodoArbolBin nodo) {
        if (nodo == null) // caso base o primitiva PARA LA EJECUCIÓN DEL MÉTODO
            return "";
        return nodo.getDato() + "\n" + preorden(nodo.getIzquierdo()) + preorden(nodo.getDerecho());
    }

    // devuelve un String con el recorrido INORDEN del árbol
    public String inorden(NodoArbolBin nodo) {
        if (nodo == null) // caso base o primitiva PARA LA EJECUCIÓN DEL MÉTODO
            return "";
        return inorden(nodo.getIzquierdo()) + nodo.getDato() + "\n" + inorden(nodo.getDerecho());
    }

    // devuelve un String con el recorrido POSTORDEN del árbol
    public String postorden(NodoArbolBin nodo) {
        if (nodo == null)
            return "";
        return postorden(nodo.getIzquierdo()) + postorden(nodo.getDerecho()) + nodo.getDato() + "\n";
    }

    public int numNodos(NodoArbolBin nodo) {

        if (nodo == null)
            return 0;
        else
            return 1 + numNodos(nodo.getIzquierdo()) + numNodos(nodo.getDerecho());

    }

    public String hojas(NodoArbolBin nodo) {
        if (nodo == null) {
            return "";
        }

        if (nodo.getIzquierdo() != null && nodo.getDerecho() != null) {

            // Como son 2 pilas de ejecucion diferentes, se va por las 2 ramas.
            // Ejecuta el izq, hace la comprobacion mientras simultaneamente hace la misma
            // llamada con el derecho.
            return hojas(nodo.getIzquierdo()) + hojas(nodo.getDerecho());
        } else {
            return nodo.getDato();
        }

    }

}