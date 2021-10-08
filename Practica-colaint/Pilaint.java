import java.util.Set;

public class ColaInt {
    private int c[]; // Vector para manejar la fila de ENTEROS
    private int frente, fin; // Apuntadores para el frente y final de la estructura

    public ColaInt() {
        c = new int[5];
        frente = 0;
        fin = -1;
    }

    public ColaInt(int n) {
        c = new int[n];
        frente = 0;
        fin = -1;
    }

    public int[] getC() {
        return c;
    }

    public int getFin() {
        return fin;
    }

    public int getFrente() {
        return frente;
    }

    public void setC(int[] c) {
        this.c = c;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public void insertar(int x) {
        if (!estaLlena()) {
            fin++;
            c[fin] = x;
        }
    }

    public int eliminar() {
        int borrado = -9999;
        if (!estaVacia()) {
            borrado = c[frente];
            c[frente] = 0;
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

    public int elementoEnFrente() {
        if (estaVacia())
            return -9999;
        else
            return c[frente];
    }

    public int elementoEnFin() {
        if (estaVacia())
            return -9999;
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
