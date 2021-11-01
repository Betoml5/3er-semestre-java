public class ColaLinealClientes {
    private Cliente c[]; // Vector para manejar la fila de ENTEROS
    private int frente, fin; // Apuntadores para el frente y final de la estructura

    public ColaLinealClientes() {
        c = new Cliente[5];
        frente = 0;
        fin = -1;
    }

    public ColaLinealClientes(int n) {
        c = new Cliente[n];
        frente = 0;
        fin = -1;
    }

    public Cliente[] getC() {
        return c;
    }

    public int getFin() {
        return fin;
    }

    public int getFrente() {
        return frente;
    }

    public void setC(Cliente[] c) {
        this.c = c;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public void insertar(Cliente x) {
        if (!estaLlena()) {
            fin++;
            c[fin] = x;
        }
    }

    public Cliente eliminar() {
        Cliente borrado = null;
        if (!estaVacia()) {
            System.out.println(c[frente].toString() + " HA SIDO ELIMINADO");
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

    public Cliente elementoEnFrente() {
        if (estaVacia())
            return null;
        else
            return c[frente];
    }

    public Cliente elementoEnFin() {
        if (estaVacia())
            return null;
        else
            return c[fin];
    }

    public float sumaSaldos() {
        float sumaTotal = 0;
        if (!estaVacia()) {
            for (int i = frente; i <= fin; i++) {
                sumaTotal += c[i].getSaldo();
            }
            return sumaTotal;
        }
        return sumaTotal;
    }

    public void aumentarSaldo(float porcentaje) {
        if (!estaVacia()) {
            for (int i = frente; i <= fin; i++) {
                float aumentoSaldo = (porcentaje * c[i].getSaldo()) / 100;
                c[i].setSaldo(c[i].getSaldo() + aumentoSaldo);
            }
        } else {
            System.out.println("No hay datos");
        }

    }

    public void mostrarClientesPorTipoCuenta(String tipoCuenta) {
        if (!estaVacia()) {
            System.out.println("Clientes fila A");
            for (int i = frente; i <= fin; i++) {
                if (c[i].getTipoCuenta().equals(tipoCuenta)) {
                    System.out.println("Nombre del cliente: " + c[i].getNombre() + ". Tipo: " + c[i].getTipoCuenta()
                            + " - COLA A");
                }
            }

        } else {
            System.out.println("No hay clientes en la fila A");
        }
    }

    public String toString() {
        String s = "";
        if (!estaVacia()) {
            for (int i = frente; i <= fin; i++)
                s += c[i].toString() + "\n";
        } else {
            System.out.println("No hay clientes para mostrar");
        }
        return s;
    }
}