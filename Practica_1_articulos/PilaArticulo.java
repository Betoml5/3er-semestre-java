
public class PilaArticulo {
    private Articulo[] p; // vector para guardar datos, únicamente se declara
    private int tope; // apuntador al último elemento de la pila

    public PilaArticulo() {
        p = new Articulo[5];
        tope = -1;
    }

    public PilaArticulo(int n) {
        p = new Articulo[n];
        tope = -1;
    }

    public Articulo[] getP() {
        return p;
    }

    public int getTope() {
        return tope;
    }

    public void setP(Articulo[] p) {
        this.p = p;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void insertar(Articulo nuevo) {
        if (!estaLlena()) {
            tope++;
            p[tope] = nuevo;
        }
    }

    public Articulo eliminar() {
        Articulo borrado = null; // variable que devuelve el dato borrado
        if (!estaVacia()) {
            borrado = p[tope]; // se saca el dato del tope
            p[tope] = null; // se borra físicamente la casilla
            tope--; // se decrementa el tope
        }
        return borrado; // se devuelve el valor eliminado
    }

    public float mostrarInventario() {
        float sumatoria = 0;
        for (int i = tope; i >= 0; i--) {
            if (p[i] != null) {
                sumatoria += p[i].getCantidad() * p[i].getPrecio();
            }
        }
        return sumatoria;
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

    public Articulo datoEnTope() {
        if (!estaVacia())
            return p[tope];
        return null;
    }

    public int numElementos() {
        return tope + 1;
    }

    public void aumentarPrecio() {
        for (int i = tope; i >= 0; i--) {
            if (p[i] != null) {
                float sumaPrecio = (float) (p[i].getPrecio() * .5);
                float precioFinal = p[i].getPrecio() + sumaPrecio;
                p[i].setPrecio(precioFinal);
            }
        }
    }

    public void mostrar20() {
        for (int i = tope; i >= 0; i--) {
            if (p[i] != null) {
                if (p[i].getCantidad() > 20) {
                    System.out.println("Descripcion: " + p[i].getDescripcion());
                }
            }
        }

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String s = "Elementos en la pila:\n";
        for (int i = tope; i >= 0; i--) {

            s += p[i] + "\n---------------------" + "\n";

        }
        s += "Fin de de la pila";

        return s;

    }
}
