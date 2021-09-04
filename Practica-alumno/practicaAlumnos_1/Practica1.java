package practicaAlumnos_1;

import java.util.Arrays;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Alumno[] arrayAlumnos = new Alumno[10];
        Scanner input = new Scanner(System.in);

        arrayAlumnos[0] = new Alumno("Beto", 2, 10, 10);

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

                    while (arrayAlumnos[position] != null) {
                        System.out.println("POSICIONES: " + Arrays.toString(arrayAlumnos));
                        System.out.println("Ingresa la posicion del nuevo alumno: ");
                        position = input.nextInt();
                    }

                    System.out.println("Ingresa el nombre del alumno");
                    String nombre = input.next();
                    System.out.println("Ingresa el grupo del alumno");
                    int grupo = input.nextInt();
                    System.out.println("Ingresa la calificacion 1");
                    float cal_1 = input.nextFloat();
                    System.out.println("Ingresa la calificacion 2");
                    float cal_2 = input.nextFloat();
                    arrayAlumnos[position] = new Alumno(nombre, grupo, cal_1, cal_2);
                    break;

                default:
                    break;
            }

        } while (option != 5);

    }
}
