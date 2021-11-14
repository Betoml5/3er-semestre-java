import java.util.Scanner;

public class ExamenUnidad2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        PilaVuelos extranjero = new PilaVuelos(9);
        PilaVuelos nacional = new PilaVuelos(9);

        int opcion;
        do {
            System.out.println("- - MENU - -");
            System.out.println("1.- Insertar vuelo");
            System.out.println("2.- Mostrar vuelos nacionales");
            System.out.println("3.- Mostrar vuelos extranjeros");
            System.out.println("4.- Eliminar TODOS los vuelos nacionales");
            System.out.println("5.- Suma TOTAL de precios");
            System.out.println("6.- Modificar el precio de un vuelo extranjero");
            System.out.println("7.- Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la ciudad de origen");
                    entrada.nextLine();
                    String ciudadOrigen = entrada.nextLine();
                    System.out.println("Ingresa la ciudad de destino");
                    String ciudadDestino = entrada.nextLine();
                    System.out.println("Ingresa el precio del vuelo");
                    float precio = entrada.nextFloat();

                    if (precio > 8500) {
                        Vuelo newVuelo = new Vuelo(ciudadOrigen, ciudadDestino, precio);
                        extranjero.insertar(newVuelo);
                    } else {
                        Vuelo newVuelo = new Vuelo(ciudadOrigen, ciudadDestino, precio);
                        nacional.insertar(newVuelo);
                    }

                    break;
                case 2:
                    System.out.println(nacional.toString());
                    break;
                case 3:
                    System.out.println(extranjero.toString());
                    break;
                case 4:
                    for (int i = nacional.getTope(); i >= 0; i--) {
                        System.out.println("ELIMINADO: " + nacional.eliminar().getCiudadDestino());
                    }
                    break;
                case 5:
                    System.out.println("Precio total: $" + nacional.sumaPrecios() + extranjero.sumaPrecios());
                    break;
                case 6:
                    System.out.println("Ingresa la ciudad de destino");
                    entrada.nextLine();
                    String ciudadBuscar = entrada.nextLine();
                    extranjero.buscarAumentarVuelo(ciudadBuscar);
                    break;
                case 7:
                    opcion = 7;
                    break;
                default:
                    break;
            }

        } while (opcion != 7);
    }
}
