import java.util.Arrays;
import java.util.Scanner;

// Equipo
// Beto Martinez
// Yahir Rivera
// Brenda Rodriguez

public class Practica5 {
    // i = 0 j = 0
    // 

    public static void main(String[] args) {
        int n = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el tamano de la matriz");
        n = entrada.nextInt();
        int matriz[][] = new int[n][];
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[i + 1];
            k = i + 1;
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = k;
                k++;
            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)
                System.out.print(matriz[i][j] + "  ");
            System.out.println();
        }

        entrada.close();
    }
}
