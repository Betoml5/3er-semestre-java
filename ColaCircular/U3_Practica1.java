import java.util.Scanner;

public class U3_Practica1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        ColaCircularString colaPalabras = new ColaCircularString(6);

        do {
            System.out.println("---MENU---");
            System.out.println("1.- Leer");
            System.out.println("2.- Mostrar palabras");
            System.out.println("3.- Eliminar una palabra");
            System.out.println("4.- Cantidad de palabras");
            System.out.println("5.- Palabra del inicio");
            System.out.println("6.- Palabra del final");
            System.out.println("7.- Eliminar todas la palabras");
            System.out.println("8.- Terminar");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingresa tu palabra");
                    String palabra = entrada.nextLine();
                    colaPalabras.insertar(palabra);
                    break;
                case 2:
                    System.out.println(colaPalabras.toString());
                    break;
                case 3:
                    System.out.println("Elemento eliminado: " + colaPalabras.eliminar());
                    break;
                case 4:
                    System.out.println("El numero de elementos en la cola es de: " + colaPalabras.numElementos());
                    break;
                case 5:
                    System.out.println("Elemento en el frente: " + colaPalabras.elementoEnFrente());
                    break;
                case 6:
                    System.out.println("Elemento en el fin: " + colaPalabras.elementoEnFin());
                    break;
                case 7:
                    colaPalabras.eliminarTodo();
                    break;
                case 8:
                    opcion = 8;
                    break;
                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }

        } while (opcion != 8);

    }
}
