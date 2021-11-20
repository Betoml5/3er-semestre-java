import java.util.Scanner;

public class ExamenListas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        String carga;
        float peso;

        ListaVagones tren = new ListaVagones();

        do {
            System.out.println(" -- MENU -- ");
            System.out.println("Selecciona con los numeros correspondientes");
            System.out.println("1.- Agregar carga");
            System.out.println("2.- Desenganchar vagon");
            System.out.println("3.- Despliega tren");
            System.out.println("4.- Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("Ingresa el nombre de la carga en: ");
                entrada.nextLine();
                carga = entrada.nextLine();
                System.out.println("Ingresa el peso en toneladas: ");
                peso = entrada.nextFloat();
                tren.insertaFinal(new NodoVagon(carga, peso));
                break;

            case 2:
                tren.eliminaInicio();
                break;
            case 3:
                tren.recorreLista();
                break;
            case 4:
                opcion = 4;
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
            }

        } while (opcion != 4);

    }
}
