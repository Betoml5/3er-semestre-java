public class PilaInt {
    private int p[]; // vector para guardar datos, únicamente se declara
    private int tope; // apuntador al último elemento de la pila

    public PilaInt() {
        p = new int[5];
        tope = -1;
    }

    public PilaInt(int n) {
        p = new int[n];
        tope = -1;
    }

    public int[] getP() {
        return p;
    }

    public int getTope() {
        return tope;
    }

    public void setP(int[] p) {
        this.p = p;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void insertar(int nuevo) {
        if (!estaLlena()) {
            tope++;
            p[tope] = nuevo;
        }
    }

    public int eliminar() {
        int borrado = -99999; // variable que devuelve el dato borrado
        if (!estaVacia()) {
            borrado = p[tope]; // se saca el dato del tope
            p[tope] = 0; // se borra físicamente la casilla
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

    public int datoEnTope() {
        if (!estaVacia())
            return p[tope];
        return -99999;
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
