import java.util.Scanner;

//Equipo
//Beto Martinez
// Yahir Rivera
// Brenda Rodriguez

public class U2_Pratica1 {
    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = "hola";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        if (s1.equals(s2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Scanner entrada = new Scanner(System.in);
        int opcion;
        PilaArticulo papeleria = new PilaArticulo(5);

        do {
            System.out.println("---MENU---");
            System.out.println("1.- Insertar un articulo");
            System.out.println("2.- Mostrar pila de articulos");
            System.out.println("3.- Eliminar un articulo");
            System.out.println("4.- Cantidad de articulos");
            System.out.println("5.- Mostrar el total del inventario");
            System.out.println("6.- Aumentar un 5% el precio de todos los articulos");
            System.out.println("7.- Mostrar articulos con cantidad > a 20");
            System.out.println("8.- Articulo mas caro");
            System.out.println("9.- Vaciar la pila");
            System.out.println("10.- Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la descripcion del articulo");
                    entrada.nextLine();
                    String descripcion = entrada.nextLine();
                    System.out.println("Ingresa la cantidad de articulos");
                    int cantidad = entrada.nextInt();
                    System.out.println("Ingresa el precio del articulo");
                    float precio = entrada.nextFloat();
                    papeleria.insertar(new Articulo(descripcion, cantidad, precio));
                    break;
                case 2:
                    if (papeleria.numElementos() == 0) {
                        System.out.println("No hay elementos en la pila");
                    } else {
                        System.out.println(papeleria.toString());
                    }

                    break;
                case 3:
                    if (papeleria.numElementos() != 0) {
                        System.out.println("Elemento eliminado: " + papeleria.eliminar());
                    } else {
                        System.out.println("NO HAY ELEMENTOS, NO PODEMOS ELIMINAR");
                    }
                    break;

                case 4:
                    System.out.println("El numero de elementos es: " + papeleria.numElementos());
                    break;
                case 5:
                    if (papeleria.numElementos() != 0) {
                        System.out.println("El total del inventario es: $" + papeleria.mostrarInventario());
                    } else {
                        System.out.println("NO HAY ELEMENTOS EN LA PILA");
                    }
                    break;

                case 6:
                    if (papeleria.numElementos() != 0) {
                        papeleria.aumentarPrecio();
                    } else {
                        System.out.println("NO HAY ELEMENTOS EN LA PILA");
                    }
                    break;
                case 7:
                    if (papeleria.numElementos() != 0) {
                        papeleria.mostrar20();
                    } else {
                        System.out.println("NO HAY ELEMENTOS EN LA PILA");
                    }
                    break;
                case 8:

                    System.out.println("Descripcion del Articulo mas caro: " + papeleria.masCaro());
                    break;
                case 9:
                    papeleria.vaciarPila();
                    break;
                case 10:
                    opcion = 10;
                    break;
                default:
                    break;
            }

        } while (opcion != 10);

        entrada.close();
    }
}
