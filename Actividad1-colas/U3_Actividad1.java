import java.util.Scanner;

//Equipo
//Beto Martinez
//Brenda Rodriguez
//Yahir Rivera

public class U3_Actividad1 {
    public static void main(String[] args) {

        ColaString singular = new ColaString(12);
        ColaString plural = new ColaString(12);

        Scanner entrada = new Scanner(System.in);
        int option;
        do {

            System.out.println("- - - MENU DE OPCIONES - - -");
            System.out.println("- - - SELECCIONA CON TU TECLADO EL NUMERO DE LA OPCION QUE QUIERAS - - -");
            System.out.println("1.- Leer palabra");
            System.out.println("2.- Mostrar palabras en singular");
            System.out.println("3.- Mostrar palabras en plural");
            System.out.println("4.- Eliminar una palabra singular");
            System.out.println("5.- Eliminar una palabra plural");
            System.out.println("6.- Cantidad de palabras");
            System.out.println("7.- Palabra al inicio de singulares");
            System.out.println("8.- Palabra al final de plurales");
            System.out.println("9.- Terminar");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingresa tu palabra");
                    entrada.nextLine();
                    String palabra = entrada.nextLine();
                    if (palabra.endsWith("s")) {
                        plural.insertar(palabra);
                    } else {
                        singular.insertar(palabra);
                    }
                    break;
                case 2:
                    System.out.println(singular.toString());
                    break;
                case 3:
                    System.out.println(plural.toString());
                    break;
                case 4:
                    singular.eliminar();
                    break;

                case 5:
                    plural.eliminar();
                    break;
                case 6:
                    System.out.println("CANTIDAD DE PALABRAS PLURAL: " + plural.numElementos());
                    System.out.println("CANTIDAD DE PALABRAS PLURAL: " + singular.numElementos());

                    System.out.println("SUMA: " + (plural.numElementos() + singular.numElementos()));
                    break;
                case 7:
                    System.out.println("PALABRA AL INICIO: " + singular.elementoEnFrente());
                    break;
                case 8:
                    System.out.println("PALABRA AL FINAL: " + plural.elementoEnFin());
                    break;
                case 9:
                    option = 9;
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    break;
            }
        } while (option != 9);

    }
}
