public class ColaCircularClientes {
    private Cliente cc[]; // Este es el vector donde se guardan los datos
    private int frente; // Apuntador al frente , YA NO SE NECESITA EL APUNTADOR DEL FINAL
    private int contador; // Ahora el control se maneja a trav�s de un CONTADOR de datos ingresados

    // 1er Constructor crea una cola CIRCULAR de 5 casillas
    public ColaCircularClientes() {
        cc = new Cliente[5];
        frente = 0;
        contador = 0;
    }

    // 2do Constructor crea una cola CIRCULAR con el numero de elementos que se
    // reciben como par�metro
    public ColaCircularClientes(int num) {
        cc = new Cliente[num];
        frente = 0;
        contador = 0;
    }

    // getters
    public Cliente[] getCc() {
        return cc;
    }

    public int getFrente() {
        return frente;
    }

    public int getContador() {
        return contador;
    }

    // setters
    public void setCc(Cliente[] nuevoCc) {
        cc = nuevoCc;
    }

    public void setFrente(int nuevoFrente) {
        frente = nuevoFrente;
    }

    public void setContador(int nuevoCont) {
        contador = nuevoCont;
    }

    // Ahora cuando est� VAC�A lo sabemos simplemente porque el CONTADOR de
    // ingresados vale CERO
    public boolean estaVacia() {
        if (contador == 0)
            return true;
        else
            return false;
    }

    // Y para checar si est� LLENA tambi�n lo podemos saber gracias al CONTADOR de
    // ingresados
    // que se compara contra la cantidad de casillas que tiene el vector
    public boolean estaLlena() {
        if (contador == cc.length)
            return true;
        else
            return false;
    }

    // Devuelve el elemento del frente de la cola CIRCULAR. NO LO ELIMINA
    public Cliente elementoEnFrente() {
        if (estaVacia())
            return null;
        else
            return cc[frente];
    }

    // Devuelve el elemento del final de la cola CIRCULAR. NO LO ELIMINA
    public Cliente elementoEnFin() {
        if (estaVacia())
            return null;
        else
            return cc[(frente - 1 + contador) % cc.length];
    }

    // Devuelve la cantidad de elementos que hay actualmente en la cola CIRCULAR
    public int numElementos() {
        return contador;
    }

    // Metodo para insertar un dato x
    public void insertar(Cliente x) {
        if (!estaLlena()) { // solo podemos insertar si NO est� llena
            cc[(frente + contador) % cc.length] = x; // se calcula la posici�n donde se insertar� x
            contador++; // obviamente se incrementa el contador, ya que se insert� un elemento
        } else {
            System.out.println("No se puede insertar, esta llena");
        }
    }

    // M�todo para eliminar un dato, devuelve el elemento eliminado � bien null si
    // no hay datos para borrar
    public Cliente eliminar() {
        Cliente eliminado = null;
        if (!estaVacia()) {
            System.out.println("El cliente: " + cc[frente].getNombre() + " HA SIDO ELIMINADO"); // solo podemos eliminar
                                                                                                // si NO est� vac�a
            eliminado = cc[frente]; // Dato que se elimina y es el que se devuelve
            cc[frente] = null; // se anula el dato de la casilla
            frente = (frente + 1) % cc.length; // se calcula la nueva posici�n del frente
            contador--; // obviamente se decrementa el contador, ya que se elimin� un elemento
            return eliminado;
        }
        System.out.println("No hay elementos en la cola, no se puede eliminar");
        return eliminado;
    }

    public void eliminarTodo() {
        Cliente eliminado = null;
        int i = 1;
        if (!estaVacia()) {

            while (i <= contador) { // ciclo para desplegar la cantidad de elemtos que hay en la cola circular
                // solo podemos eliminar si NO est� vac�a
                System.out.println("Elemento eliminado: " + cc[frente]);
                eliminado = cc[frente]; // Dato que se elimina y es el que se devuelve
                cc[frente] = null; // se anula el dato de la casilla
                frente = (frente + 1) % cc.length; // se calcula la nueva posici�n del frente
                contador--; // obviamente se decrementa el contador, ya que se elimin� un elemento
            }
        }

    }

    public float sumarSaldos() {
        float sumaTotal = 0;
        int i = 1, indice = frente;
        if (!estaVacia()) {
            while (i <= contador) { // ciclo para desplegar la cantidad de elemtos que hay en la cola circular // se
                sumaTotal += cc[indice].getSaldo(); // concatena cada elemento de acuerdo al �ndice en una variable
                                                    // string
                if (indice == cc.length - 1) // si ya est� el �ndie en la �ltima casilla, tiene que regresar a la
                                             // posici�n 0
                    indice = 0;
                else // si no est� en la �ltima casilla, simplemente se incrementa el �ndice a la
                     // sig. casilla
                    indice++;
                i++; // se incrementa i que controla la cantidad de elementos que hay actualmente en
                     // la cola circular
            }

            return sumaTotal;
        }
        return sumaTotal;
    }

    public void mostrarClientesPorTipoCuenta(String tipoCuenta) {
        if (!estaVacia()) {
            int i = 1, indice = frente;
            System.out.println("Clientes fila B");
            while (i <= contador) { // ciclo para desplegar la cantidad de elemtos que hay en la cola circular
                if (cc[indice].getTipoCuenta().equals(tipoCuenta)) {
                    System.out.println("Nombre del cliente: " + cc[indice].getNombre() + ". Tipo: "
                            + cc[indice].getTipoCuenta() + " - COLA B");
                } // se concatena cada elemento de acuerdo al �ndice en una variable string
                if (indice == cc.length - 1) // si ya est� el �ndie en la �ltima casilla, tiene que regresar a la
                                             // posici�n 0
                    indice = 0;
                else // si no est� en la �ltima casilla, simplemente se incrementa el �ndice a la
                     // sig. casilla
                    indice++;
                i++; // se incrementa i que controla la cantidad de elementos que hay actualmente en
                     // la cola circular
            }
        } else {
            System.out.println("No hay clientes en la fila B");
        }
    }

    public void transferirBtoA(ColaLinealClientes colaA, ColaCircularClientes colaB) {
        int i = 1, indice = colaB.getFrente(), contadorAux = colaB.getContador();

        if (!colaB.estaVacia()) {
            while (i <= contadorAux) {
                if (indice == colaB.getCc().length - 1)
                    indice = 0;
                else
                    indice++;
                colaA.insertar(colaB.eliminar());
                i++;

            }

        }
    }

    public String toString() {
        String s = "";
        int i = 1, indice = frente;
        if (!estaVacia()) {

            while (i <= contador) { // ciclo para desplegar la cantidad de elemtos que hay en la cola circular
                s += cc[indice] + "\n"; // se concatena cada elemento de acuerdo al �ndice en una variable string
                if (indice == cc.length - 1) // si ya est� el �ndie en la �ltima casilla, tiene que regresar a la
                                             // posici�n 0
                    indice = 0;
                else // si no est� en la �ltima casilla, simplemente se incrementa el �ndice a la
                     // sig. casilla
                    indice++;
                i++; // se incrementa i que controla la cantidad de elementos que hay actualmente en
                     // la cola circular
            }
        } else {
            System.out.println("No hay clientes que mostrar");
        }
        return s;
    }
}
