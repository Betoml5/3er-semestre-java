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

        int result = random.nextInt((miLista.numNodos - 1) + 1) + 1;

        Nodo r = miLista.inicio;
        Nodo nodoRelativo = miLista.inicio;
        Nodo nodoAtrasRelativo = null;
        int ultimaPosicion = 2;
        System.out.println("numero random: " + result);
        for (int i = 0; i < 2; i++) {

            System.out.println("Nodo de atras: " + nodoAtrasRelativo);
            System.out.println("Nodo actual: " + nodoRelativo);
            System.out.println("----------------------");

            nodoAtrasRelativo = miLista.inicio;
            nodoRelativo = miLista.inicio.getEnlace();

            ultimaPosicion--;
            if (ultimaPosicion == 0) {
                Nodo eliminado = nodoRelativo;
                nodoAtrasRelativo.setEnlace(eliminado.getEnlace());

                System.out.println("Llegaste a tu destino. Nombre del nodo: " + nodoRelativo.getNombre());
                nodoRelativo = nodoRelativo.getEnlace();
                System.out.println("El nodo quedo en: " + nodoRelativo);
                System.out.println("NODO ELIMINADO: " + eliminado.getNombre());
            }
        }

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
