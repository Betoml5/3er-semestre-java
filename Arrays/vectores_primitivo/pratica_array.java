package vectores_primitivo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * array
 */
public class pratica_array {

    public static void main(String[] args) {
        // Los vectores de tipo primitivo, guardar directamente el valor en memoria
        int[] myArray = new int[5];

        // En cambio a los arrays de tipo [Object] guardar una referencia en memoria
        Alumno[] alumnosArray = new Alumno[5];

        Alumno beto = new Alumno("Beto");
        alumnosArray[0] = beto;

        // System.out.println("Nombre del alumno " + alumnosArray[0].toString());
        // System.out.println(alumnosArray[0]);
        // System.out.println(alumnosArray);

        int x[] = new int[10];

        System.out.println("Vector recien creado:\n" + Arrays.toString(x));

        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
        }

        System.out.println("Vector recien creado:\n" + Arrays.toString(x));
    }
}