
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
        if (!estaVacia()) {
            float sumatoria = 0;
            for (int i = tope; i >= 0; i--) {
                if (p[i] != null) {
                    sumatoria += p[i].getCantidad() * p[i].getPrecio();
                }
            }
            return sumatoria;
        } else {
            System.out.println("La pila esta vacia");
            return 0;
        }
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
        if (!estaVacia()) {
            for (int i = tope; i >= 0; i--) {
                if (p[i] != null) {
                    float sumaPrecio = (float) (p[i].getPrecio() * .5);
                    float precioFinal = p[i].getPrecio() + sumaPrecio;
                    p[i].setPrecio(precioFinal);
                }
            }
        } else {
            System.out.println("La pila esta vacia");
        }
    }

    public void mostrar20() {
        if (!estaVacia()) {
            for (int i = tope; i >= 0; i--) {
                if (p[i] != null) {
                    if (p[i].getCantidad() > 20) {
                        System.out.println("Descripcion: " + p[i].getDescripcion());
                    }
                }
            }
        } else {
            System.out.println("La pila esta vacia");
        }

    }

    public String masCaro() {
        int masCaroIndex = 0;
        if (!estaVacia()) {
            float precioMasCaro = 0;

            for (int i = tope; i >= 0; i--) {
                if (p[i].getPrecio() > precioMasCaro) {
                    masCaroIndex = i;
                    precioMasCaro = p[i].getPrecio();
                }
            }
            return p[masCaroIndex].getDescripcion();
        } else {
            System.out.println("La pila esta vacia");
            return "";
        }

    }

    public void vaciarPila() {
        if (!estaVacia()) {
            int i = tope;
            while (i >= 0) {
                System.out.println("ELIMINADO: " + p[i].getDescripcion());
                p[i] = null;
                i--;
                tope--;
            }
            System.out.println("SE VACIO LA PILA");
        } else {
            System.out.println("LA PILA ESTA VACIA");
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
