public class PilaVuelos {
    private Vuelo p[]; // vector para guardar datos, únicamente se declara
    private int tope; // apuntador al último elemento de la pila

    public PilaVuelos(int n) {
        p = new Vuelo[n];
        tope = -1;
    }

    public Vuelo[] getP() {
        return p;
    }

    public int getTope() {
        return tope;
    }

    public void setP(Vuelo[] p) {
        this.p = p;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void insertar(Vuelo nuevo) {
        if (!estaLlena()) {
            tope++;
            p[tope] = nuevo;
        } else {
            System.out.println("No se puede insertar, esta llena");
        }
    }

    public Vuelo eliminar() {
        Vuelo borrado = null; // variable que devuelve el dato borrado
        if (!estaVacia()) {
            borrado = p[tope]; // se saca el dato del tope
            p[tope] = null; // se borra físicamente la casilla
            tope--; // se decrementa el tope
        }
        System.out.println("No se puede eliminar, no hay elementos");
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

    public Vuelo datoEnTope() {
        if (!estaVacia())
            return p[tope];
        System.out.println("No hay dato en la pila");
        return null;
    }

    public int numElementos() {
        return tope + 1;
    }

    public float sumaPrecios() {
        float sumaTotal = 0;
        if (!estaVacia()) {
            for (int i = tope; i >= 0; i--) {
                sumaTotal += p[i].getPrecio();
            }
            return sumaTotal;
        } else {
            System.out.println("ESTA PILA ESTA VACIA");
            return sumaTotal;
        }

    }

    public void buscarAumentarVuelo(String ciudadDestino) {
        if (!estaVacia()) {
            for (int i = this.tope; i >= 0; i--) {
                if (p[i].getCiudadDestino().equals(ciudadDestino)) {
                    float nuevoPrecio = p[i].getPrecio() + 580;
                    p[i].setPrecio(nuevoPrecio);
                } else {
                    System.out.println("Vuelo con destino no encontrado");
                }
            }
        } else {
            System.out.println("No hay elementos en la pila");
        }
    }

    @Override
    public String toString() {
        if (!estaVacia()) {
            // TODO Auto-generated method stub
            String s = "Elementos en la pila:\n";
            for (int i = tope; i >= 0; i--) {
                s += p[i].toString() + "\n";
            }
            s += "Fin de de la pila";

            return s;
        }

        return "No hay elementos en la pila";

    }
}
