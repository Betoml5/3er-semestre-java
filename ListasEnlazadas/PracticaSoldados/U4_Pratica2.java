
/**
 * U4_Pratica2-1
 */
import java.util.Random;

public class U4_Pratica2 {

    public static void main(String[] args) {
        Random random = new Random();
        ListaCircular miLista = new ListaCircular();

        miLista.insertaFinal(new Nodo("Jesus"));
        miLista.insertaFinal(new Nodo("Luis"));
        miLista.insertaFinal(new Nodo("Beto")); // Nodo Relativo ->
        miLista.insertaFinal(new Nodo("Pedro"));
        miLista.insertaFinal(new Nodo("Julian")); // Segundo for aqui
        miLista.insertaFinal(new Nodo("Daniel"));

        // NJesus
        Nodo nodoActual = miLista.getInicio();
        Nodo nodoAtras = null;
        while (miLista.numNodos != 1 && miLista.numNodos != 0) {
            int numeroRandom = random.nextInt((6 - 1) + 1) + 1;
            int n = numeroRandom;
            System.out.println("Numero random: " + numeroRandom);
            System.out.println("_______________________________");
            for (int i = 0; i < numeroRandom; i++) {

                System.out.println("Nodo atras: " + nodoAtras);
                System.out.println("Nodo actual: " + nodoActual);

                n--;
                if (n == 0) {
                    System.out.println("Nodo eliminado: " + nodoActual.getNombre());
                    Nodo eliminado = nodoActual;
                    nodoAtras.setEnlace(eliminado.getEnlace());
                    nodoActual = nodoActual.getEnlace();
                    miLista.numNodos--;
                    break;
                }

                if (nodoAtras != null) {
                    nodoAtras = nodoAtras.getEnlace();
                } else {
                    nodoAtras = miLista.inicio;
                }

                nodoActual = nodoActual.getEnlace();

            }

        }

        System.out.println("Numero de nodos: " + miLista.numNodos);
        System.out.println("El nodo que quedo fue: " + nodoActual.getNombre());

    }
}