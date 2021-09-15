import java.util.Arrays;
import java.util.Scanner;

// Equipo
// Beto Martinez
// Yahir Rivera
// Brenda Rodriguez

public class Practica6 {

    static String[][] m1 = { { "Hugo", "Paco", "Luis" }, { "Mickey", "Minnie", "Donald" } };
    static String m2[][] = new String[3][2];

    public static void invertirMatriz() {

        String holdingArray[] = new String[m1[0].length];
        for (int i = 0; i < holdingArray.length; i++) {
            holdingArray[i] = m1[0][i];
        }

        for (int i = 0; i < m2.length; i++) {
            m2[i][0] = holdingArray[i];
        }

        for (int i = 0; i < m2.length; i++) {
            m2[i][1] = m1[1][i];
        }
        System.out.println("Desplegando matriz normal");

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++)
                System.out.print(m1[i][j] + "  ");
            System.out.println();
        }

        System.out.println("Desplegando matriz transpuesta");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++)
                System.out.print(m2[i][j] + "  ");
            System.out.println();
        }
    }

    public static void diagonalLlena(int n) {
        int matriz[][] = new int[n][n];
        int j = 0;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][j] = 1;
            for (int k = 0; k < matriz[i].length; k++) {
                if (k > j) {
                    matriz[i][k] = 2;
                }
                System.out.print(matriz[i][k] + "  ");
            }
            System.out.println();
            j++;
        }
    }

    public static void main(String[] args) {

        boolean salir = true;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("- - - - - - - - - - - - - - Menu - - - - - - - - - - - - - -");
            System.out.println("- - - Escribe el numero de la opcion que quieres hacer - - -");
            System.out.println("1. Invertir Matriz");
            System.out.println("2. Generar Matriz Cuadrada");
            System.out.println("3. Salir");
            int opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    invertirMatriz();
                    break;
                case 2:
                    System.out.println("Ingresa el tamano de la matriz cuadrada: ");
                    int n = entrada.nextInt();
                    diagonalLlena(n);
                    break;
                case 3:
                    salir = false;
                    break;
            }

        } while (salir);

    }

}
