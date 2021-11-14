import java.util.Random;

public class U4_Practica2 {
    public static void main(String[] args) {

        ListaCircular miLista = new ListaCircular();

        miLista.insertaFinal(new Nodo("Jesus"));
        miLista.insertaFinal(new Nodo("Luis"));
        miLista.insertaFinal(new Nodo("Beto")); // Nodo Relativo ->
        miLista.insertaFinal(new Nodo("Pedro"));
        miLista.insertaFinal(new Nodo("Julian")); // Segundo for aqui
        miLista.insertaFinal(new Nodo("Daniel"));

        System.out.println(miLista.toString());

        Random random = new Random();

        Nodo nodoAtras = miLista.inicio;
        Nodo nodoActual = miLista.inicio.getEnlace();
        while (miLista.numNodos != 1 && miLista.numNodos != 0) {
            int numeroRandom = random.nextInt((6 - 1) + 1) + 1;
            int ultimaPosicion = numeroRandom;
            System.out.println("numero random: " + numeroRandom);

            for (int i = 0; i <= numeroRandom; i++) {

                System.out.println("VUELTA NUM " + i);
                System.out.println("Nodo de atras: " + nodoAtras);
                System.out.println("Nodo actual: " + nodoActual);
                System.out.println("----------------------");

                ultimaPosicion--;
                if (ultimaPosicion == 0) {
                    Nodo eliminado = nodoActual;
                    nodoAtras.setEnlace(eliminado.getEnlace());

                    System.out.println("Llegaste a tu destino. Nombre del nodo: " + nodoActual.getNombre());
                    nodoActual = nodoActual.getEnlace();
                    System.out.println("El nodo quedo en: " + nodoActual);
                    System.out.println("NODO ELIMINADO: " + eliminado.getNombre());
                    miLista.numNodos--;
                    break;
                }

                nodoAtras = nodoAtras.getEnlace();
                nodoActual = nodoActual.getEnlace();

            }
        }

        System.out.println("Numero de nodos: " + miLista.numNodos);

        // FUNCIONA INICIO

        /// FUNCIONA FIN

        // ultimaPosicion = 2;
        // for (int i = 0; i < 2; i++) {
        // ultimaPosicion--;
        // if (ultimaPosicion == 0) {
        // System.out.println("Llegaste a tu destino. Nombre del nodo: " +
        // nodoRelativo.getNombre());
        // nodoRelativo = nodoRelativo.getEnlace();
        // System.out.println("El nodo relativo queda en: " + nodoRelativo.getNombre());

        // }

        // nodoRelativo = nodoRelativo.getEnlace();
        // }

    }
}
