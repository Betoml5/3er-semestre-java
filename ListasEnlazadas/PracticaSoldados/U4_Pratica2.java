
/**
 * U4_Pratica2-1
 */
import java.util.Random;
import java.util.Scanner;

public class U4_Pratica2 {

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        ListaCircular miLista = new ListaCircular();
        int numeroSoldados;
        System.out.println("Ingresa el numero de soldados");
        numeroSoldados = entrada.nextInt();

        while (numeroSoldados <= 1) {
            System.out.println("El numero de soldados debe ser al menos 2");
            System.out.println("Ingresa el numero de soldados");
            numeroSoldados = entrada.nextInt();
        }
        entrada.nextLine();
        for (int i = 0; i < numeroSoldados; i++) {
            System.out.println("Ingresa el nombre del soldado: ");
            String nombre = entrada.nextLine();
            miLista.insertaFinal(new Nodo(nombre));
        }
        System.out.println("Lista de soldados: ");
        System.out.println(miLista.toString());

        // NJesus
        Nodo nodoActual = miLista.getInicio();
        Nodo nodoAtras = null;
        while (miLista.numNodos != 1 && miLista.numNodos != 0) {
            int numeroRandom = random.nextInt((6 - 1) + 1) + 1;
            int n = numeroRandom;

            System.out.println("Soldado: " + nodoActual.getNombre() + " lanzando dado...");
            Thread.sleep(4000);
            System.out.println("Numero del dado: " + "\033[0;1m" + numeroRandom);
            Thread.sleep(2000);
            for (int i = 0; i < numeroRandom; i++) {

                n--;
                if (n == 0) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Soldado eliminado: " + nodoActual.getNombre());
                    System.out.println("-------------------------------------------");
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
        System.out.println("El soldado que quedo fue: " + nodoActual.getNombre());
        System.out.println("Soldado escapando.");
        Thread.sleep(1000);
        System.out.println("Soldado escapando..");
        Thread.sleep(1500);
        System.out.println("Soldado escapando...");
        Thread.sleep(2000);

    }
}