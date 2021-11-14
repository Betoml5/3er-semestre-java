import java.util.Set;

public class ColaLibros {
    private Libro c[]; // Vector para manejar la fila de ENTEROS
    private int frente, fin; // Apuntadores para el frente y final de la estructura

    public ColaLibros() {
        c = new Libro[5];
        frente = 0;
        fin = -1;
    }

    public ColaLibros(int n) {
        c = new Libro[n];
        frente = 0;
        fin = -1;
    }

    public Libro[] getC() {
        return c;
    }

    public int getFin() {
        return fin;
    }

    public int getFrente() {
        return frente;
    }

    public void setC(Libro[] c) {
        this.c = c;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public void insertar(Libro x) {
        if (!estaLlena()) {
            fin++;
            c[fin] = x;
        }
    }

    public Libro eliminar() {
        Libro borrado = null;
        if (!estaVacia()) {
            borrado = c[frente];
            c[frente] = null;
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

    public Libro elementoEnFrente() {
        if (estaVacia())
            return null;
        else
            return c[frente];
    }

    public Libro elementoEnFin() {
        if (estaVacia())
            return null;
        else
            return c[fin];
    }

    public String toString() {
        String s = "";
        for (int i = frente; i <= fin; i++)
            s += c[i] + "\n";
        return s;
    }

    public String titulosAutores() {
        String s = "";
        if (!estaVacia()) {
            for (int i = frente; i <= fin; i++) {
                if (c[i].getNumPaginas() > 200 && c[i].getPrecio() < 300) {
                    s += "El autor: " + c[i].getAutor() + " del libro: " + c[i].getTitulo() + "\n";

                }
            }

            return s;
        }
        return s;
    }

    public void modificaPrecio() {
        if (!estaVacia()) {
            for (int i = frente; i <= fin; i++) {
                if (c[i].getAutor().equals("Octavio Paz")) {
                    float rebaje = (float) (c[i].getPrecio() * 0.15);
                    c[i].setPrecio(c[i].getPrecio() - rebaje);
                }
            }
        }
    }

}
