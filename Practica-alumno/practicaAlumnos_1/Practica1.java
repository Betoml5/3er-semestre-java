package practicaAlumnos_1;

import java.util.Arrays;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Alumno[] arrayAlumnos = new Alumno[10];
        Scanner input = new Scanner(System.in);

        // arrayAlumnos[0] = new Alumno("Beto", 2, 10, 10);

        int option;
        do {
            System.out.println("- - - MENU DE OPCIONES - - -");
            System.out.println("- - - SELECCIONA CON TU TECLADO EL NUMERO DE LA OPCION QUE QUIERAS - - -");
            System.out.println("1.- Alta de un alumno");
            System.out.println("2.- Mostrar alumnos");
            System.out.println("3.- Alumnos de un grupo");
            System.out.println("4.- Alumnos con promedio reprobado");
            System.out.println("5.- Salir");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("POSICIONES: " + Arrays.toString(arrayAlumnos));
                    System.out.println("Ingresa la posicion del nuevo alumno: ");
                    int position = input.nextInt();
                    if (position > 9 || position < 0) {
                        System.out.println("Esa posicion en el arreglo no existe");
                        break;
                    }
                    while (arrayAlumnos[position] != null) {
                        System.out.println("Esa posicion esta ocupada, ingresa otra");
                        System.out.println("POSICIONES: " + Arrays.toString(arrayAlumnos));
                        System.out.println("Ingresa la posicion del nuevo alumno: ");
                        position = input.nextInt();
                        if (position > 9 || position < 0) {
                            System.out.println("Esa posicion en el arreglo no existe");
                            break;
                        }
                    }
                    System.out.println("Ingresa el nombre del alumno");
                    input.nextLine();
                    String nombre = input.nextLine();
                    System.out.println("Ingresa el grupo del alumno");
                    int grupo = input.nextInt();
                    System.out.println("Ingresa la calificacion 1");
                    float cal_1 = input.nextFloat();
                    System.out.println("Ingresa la calificacion 2");
                    float cal_2 = input.nextFloat();
                    arrayAlumnos[position] = new Alumno(nombre, grupo, cal_1, cal_2);
                    break;
                case 2:
                    for (int i = 0; i < arrayAlumnos.length; i++) {
                        if (arrayAlumnos[i] != null) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Nombre del alumno: " + arrayAlumnos[i].getNombre() + ". Indice: " + i);
                            System.out.println("Grupo: " + arrayAlumnos[i].getGrupo());
                            System.out.println("Calificacion 1: " + arrayAlumnos[i].getCalif1());
                            System.out.println("Calificacion 2: " + arrayAlumnos[i].getCalif2());
                            System.out.println("Promedio: " + arrayAlumnos[i].obtenerPromedio());
                            System.out.println("------------------------------------------------");
                        } else {
                            System.out.println("Vacante vacia");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el grupo que deseas ver");
                    int grupoOpcion = input.nextInt();
                    for (int i = 0; i < arrayAlumnos.length; i++) {
                        if (arrayAlumnos[i] != null) {
                            if (arrayAlumnos[i].getGrupo() == grupoOpcion) {
                                System.out.println("------------------------------------------------");
                                System.out.println("Nombre: " + arrayAlumnos[i].getNombre() + ". Grupo: "
                                        + arrayAlumnos[i].getGrupo());
                                System.out.println("------------------------------------------------");
                            }
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < arrayAlumnos.length; i++) {
                        if (arrayAlumnos[i] != null) {
                            if (arrayAlumnos[i].obtenerPromedio() < 6) {
                                System.out.println("------------------------------------------------");
                                System.out.println("Nombre: " + arrayAlumnos[i].getNombre());
                                System.out.println("Calificacion 1: " + arrayAlumnos[i].getCalif1());
                                System.out.println("Calificacion 2: " + arrayAlumnos[i].getCalif2());
                                System.out.println("------------------------------------------------");
                            }
                        }
                    }
                    break;

                case 5:
                    option = 5;
                    break;
                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }

        } while (option != 5);

    }
}
