public class PilaString {
    private String[] p; // vector para guardar datos, únicamente se declara
    private int tope; // apuntador al último elemento de la pila

    public PilaString() {
        p = new String[5];
        tope = -1;
    }

    public PilaString(int n) {
        p = new String[n];
        tope = -1;
    }

    public String[] getP() {
        return p;
    }

    public int getTope() {
        return tope;
    }

    public void setP(String[] p) {
        this.p = p;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void insertar(String nuevo) {
        if (!estaLlena()) {
            tope++;
            p[tope] = nuevo;
        }
    }

    public String eliminar() {
        String borrado = ""; // variable que devuelve el dato borrado
        if (!estaVacia()) {
            borrado = p[tope]; // se saca el dato del tope
            p[tope] = null; // se borra físicamente la casilla
            tope--; // se decrementa el tope
        }
        return borrado; // se devuelve el valor eliminado
    }

    public boolean estaVacia() {
        if (tope == -1) {
            return true;

        } else {
            return false;
        }
    }

    public boolean estaLlena() {
        if (tope == p.length - 1)
            return true;
        return false;
    }

    public String datoEnTope() {
        if (!estaVacia())
            return p[tope];
        return null;
    }

    public int numElementos() {
        return tope + 1;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String s = "Elementos en la pila:\n";
        for (int i = tope; i >= 0; i--) {
            s += p[i] + "\n";
        }
        s += "Fin de de la pila";

        return s;

    }
}
