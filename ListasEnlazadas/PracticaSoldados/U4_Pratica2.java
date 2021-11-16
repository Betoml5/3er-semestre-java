
/**
 * U4_Pratica2-1
 */
import java.util.Random;
import java.util.Scanner;

public class U4_Pratica2 {

    // Equipo
    // Beto Martinez
    // Yahir Rivera
    // Brenda Rodriguez

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

        // Jesus -> Luis -> Julian

        Nodo nodoActual = miLista.getInicio();
        Nodo nodoAtras = null;

        while (miLista.numNodos != 1 && miLista.numNodos != 0) {
            int numeroRandom = random.nextInt((6 - 1) + 1) + 1;

            int n = numeroRandom;

            System.out.println("Soldado: " + nodoActual.getNombre() + " lanzando dado...");

            System.out.println("Numero del dado: " + "\033[0;1m" + numeroRandom);

            if (numeroRandom == 1 && nodoAtras == null) {
                System.out.println("-------------------------------------------");
                System.out.println("Soldado eliminado: " + nodoActual.getNombre());
                System.out.println("-------------------------------------------");
                nodoActual = nodoActual.getEnlace();
                miLista.inicio = nodoActual;
                miLista.numNodos--;

                System.out.println("Los soldados que quedan son: ");
                Nodo nodoAux = miLista.inicio;
                for (int j = 0; j < miLista.numNodos; j++) {
                    System.out.println("Soldado: " + nodoAux.getNombre());
                    nodoAux = nodoAux.getEnlace();
                }

            } else {
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

                        System.out.println("Los soldados que quedan son: ");
                        Nodo nodoAux = miLista.inicio;
                        for (int j = 0; j < miLista.numNodos; j++) {
                            System.out.println("Soldado: " + nodoAux.getNombre());
                            nodoAux = nodoAux.getEnlace();
                        }
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

        }

        System.out.println("El soldado que quedo fue: " + nodoActual.getNombre());
        System.out.println("Soldado escapando.");

        System.out.println("Soldado escapando..");

        System.out.println("Soldado escapando...");

    }
}