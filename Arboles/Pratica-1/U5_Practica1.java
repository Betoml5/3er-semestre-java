package Practica1;

import java.util.Scanner;

public class U5_Practica1 {
    // Equipo 5
    // Beto Martinez
    // Yahir Rivera
    // Brenda Rodriguez
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArbolBinArticulos tree = new ArbolBinArticulos();
        int opcion;
        String descripcion;
        float precio;

        do {
            System.out.println("-- MENU -- ");
            System.out.println("1.- Insertar un articulo");
            System.out.println("2.- Mostrar articulos en INORDEN");
            System.out.println("3.- Mostrar articulos en PREORDEN");
            System.out.println("4.- Cantidad de articulos");
            System.out.println("5.- Suma total de precios");
            System.out.println("6.- Artiuclos con precio > $500");
            System.out.println("7.- Buscar un articulo");
            System.out.println("8.- Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la descripcion del Articulo");
                    entrada.nextLine();
                    descripcion = entrada.nextLine();
                    System.out.println("Ingresa el precio del Articulo");
                    precio = entrada.nextFloat();
                    tree.insertarNodo(new NodoArbolBinArticulo(descripcion, precio));
                    break;
                case 2:
                    System.out.println(tree.inorden(tree.getRaiz()));
                    break;
                case 3:
                    System.out.println(tree.preorden(tree.getRaiz()));
                    break;
                case 4:
                    System.out.println("El numero de articulos es: " + tree.numNodos(tree.getRaiz()));
                    break;
                case 5:
                    System.out.println("La suma de precios es $" + tree.sumPrecios(tree.getRaiz()));
                    break;
                case 6:
                    String descripciones = tree.articulos500(tree.getRaiz());
                    if (descripciones.equals("")) {
                        System.out.println("No hay Articulos mayores a $500");
                    } else {
                        System.out.println("Los articulos con precio > $500 son: " + descripciones);
                    }
                    break;

                case 7:
                    System.out.println("Ingresa la descripcion del articulo a buscar: ");
                    entrada.nextLine();
                    descripcion = entrada.nextLine();
                    String buscado = tree.buscarArticulo(tree.getRaiz(), descripcion);
                    if (buscado.equals("")) {
                        System.out.println("No encontramos ese articulo");
                    } else {
                        System.out.println("Articulo encontrado");
                        System.out.println(buscado);
                    }

                    break;
                case 8:
                    opcion = 8;
                    break;

                default:
                    break;
            }

        } while (opcion != 8);

    }
}
