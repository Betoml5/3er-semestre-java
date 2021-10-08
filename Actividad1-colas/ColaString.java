public class ColaString {
    private String c[]; // Vector para manejar la fila de ENTEROS
    private int frente, fin; // Apuntadores para el frente y final de la estructura

    public ColaString() {
        c = new String[5];
        frente = 0;
        fin = -1;
    }

    public ColaString(int n) {
        c = new String[n];
        frente = 0;
        fin = -1;
    }

    public String[] getC() {
        return c;
    }

    public int getFin() {
        return fin;
    }

    public int getFrente() {
        return frente;
    }

    public void setC(String[] c) {
        this.c = c;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public void insertar(String x) {
        if (!estaLlena()) {
            fin++;
            c[fin] = x;
        }
    }

    public String eliminar() {
        String borrado = "";
        if (!estaVacia()) {
            borrado = c[frente];
            c[frente] = "";
            frente++;
            if (estaVacia()) { // si al eliminar, la cola queda VACÍA, se ajustan los
                frente = 0; // apuntadores para reutilizar las casillas del principio
                fin = -1; // y optimizar espacio
            }
        }
        return borrado;
    }

    public boolean estaVacia() {
        if (frente > fin)
            return true;
        else
            return false;
    }

    public boolean estaLlena() {
        if (fin == c.length - 1)
            return true;
        else
            return false;
    }

    public int numElementos() {
        return fin - frente + 1;
    }

    public String elementoEnFrente() {
        if (estaVacia())
            return "";
        else
            return c[frente];
    }

    public String elementoEnFin() {
        if (estaVacia())
            return "";
        else
            return c[fin];
    }

    public String toString() {
        String s = "";
        for (int i = frente; i <= fin; i++)
            s += c[i] + "\n";
        return s;
    }
}
