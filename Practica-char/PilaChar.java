public class PilaChar {

    // Equipo
    // Alberto Martinez
    // Yahir Rivera
    // Brenda Rodriguez
    private char[] p; // vector para guardar datos, únicamente se declara
    private int tope; // apuntador al último elemento de la pila

    // public PilaChar() {
    // p = new char[5];
    // tope = -1;
    // }

    public PilaChar(int n) {
        p = new char[n];
        tope = -1;
    }

    public char[] getP() {
        return p;
    }

    public int getTope() {
        return tope;
    }

    public void setP(char[] p) {
        this.p = p;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void insertar(char nuevo) {
        if (!estaLlena()) {
            tope++;
            p[tope] = nuevo;
        }
    }

    public char eliminar() {
        char borrado = '\u0000'; // variable que devuelve el dato borrado
        if (!estaVacia()) {
            borrado = p[tope]; // se saca el dato del tope
            p[tope] = '\u0000'; // se borra físicamente la casilla
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

    public char datoEnTope() {
        if (!estaVacia())
            return p[tope];
        return ' ';
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
