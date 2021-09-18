package Examen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Examen_U1 {

    public static void main(String[] args) {
        Articulo abarrotes[] = new Articulo[10];
        Scanner entrada = new Scanner(System.in);
        int option;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1 --- Capturar un articulo ---");
            System.out.println("2 --- Mostrar datos de articulos ---");
            System.out.println("3 --- Total de inventario ---");
            System.out.println("4 --- Aumentar 7% a todos los articulos ---");
            System.out.println("5 --- Manejo de una matriz ---");
            System.out.println("6 --- Salir ---");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    System.out.println("POSICIONES: " + Arrays.deepToString(abarrotes));
                    System.out.println("Ingresa la posicion del nuevo articulo: ");
                    int position = entrada.nextInt();
                    if (position > 9 || position < 0) {
                        System.out.println("Esa posicion en el arreglo no existe");
                        break;
                    }
                    while (abarrotes[position] != null) {
                        System.out.println("Esa posicion esta ocupada, ingresa otra");
                        System.out.println("POSICIONES: " + Arrays.toString(abarrotes));
                        System.out.println("Ingresa la posicion del nuevo articulo: ");
                        position = entrada.nextInt();
                        if (position > 9 || position < 0) {
                            System.out.println("Esa posicion en el arreglo no existe");
                            break;
                        }
                    }
                    System.out.println("Ingresa la descripcion del articulo");
                    entrada.nextLine();
                    String descripcion = entrada.nextLine();
                    System.out.println("Ingresa la cantidad de articulos");
                    int cantidad = entrada.nextInt();
                    System.out.println("Ingresa el precio del articulo");
                    float precio = entrada.nextFloat();
                    abarrotes[position] = new Articulo(descripcion, cantidad, precio);
                    break;
                case 2:

                    for (int i = 0; i < abarrotes.length; i++) {
                        if (abarrotes[i] != null) {
                            System.out.println("-----------------------------");
                            System.out.println(abarrotes[i].toString() + " Indice: " + i);
                            System.out.println("-----------------------------");
                        }

                        System.out.println("No hay datos que mostrar");
                    }

                    break;
                case 3:
                    float sumatoria = 0;
                    for (int i = 0; i < abarrotes.length; i++) {
                        if (abarrotes[i] != null) {
                            sumatoria += abarrotes[i].getCantidad() * abarrotes[i].getPrecio();
                        }

                    }
                    System.out.println("Total del inventario: " + sumatoria);
                    break;
                case 4:
                    for (int i = 0; i < abarrotes.length; i++) {
                        if (abarrotes[i] != null) {
                            float sumaPrecio = (float) (abarrotes[i].getPrecio() * .7);
                            float precioFinal = abarrotes[i].getPrecio() + sumaPrecio;
                            abarrotes[i].setPrecio(precioFinal);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingresa el tamano de la matriz");
                    int n = entrada.nextInt();

                    int matriz[][] = new int[n][n];

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            // Random random = new Random();
                            int numero = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
                            matriz[i][j] = numero;
                        }
                    }

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++)
                            System.out.print(matriz[i][j] + "  ");
                        System.out.println();
                    }

                    int cantidadMultiplos = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (matriz[i][j] != 0) {
                                if (matriz[i][j] % 5 == 0) {
                                    cantidadMultiplos++;
                                }
                            }
                        }
                    }
                    System.out.println("Cantidad de multiplos: " + cantidadMultiplos);
                    int[] diagoPrincipal = new int[matriz.length];
                    int[] diagoSecundaria = new int[matriz.length];

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (i == j) {
                                diagoPrincipal[i] = matriz[i][j];
                            }

                            if (i + j == matriz.length - 1) {
                                diagoSecundaria[i] = matriz[i][j];
                            }
                        }
                    }
                    int suma = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (matriz[i][j] != diagoPrincipal[i] && matriz[i][j] != diagoSecundaria[i]) {
                                suma += matriz[i][j];
                            }
                        }
                    }
                    System.out.println("Suma de no diagonales: " + suma);
                    break;
                default:
                    option = 6;
                    break;
            }
        } while (option != 6);
    }
}
