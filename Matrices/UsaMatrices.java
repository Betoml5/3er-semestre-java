import java.util.Arrays; //clase abstracta
import java.util.Scanner;

public class UsaMatrices {
   static int i, j;
   static int m[][];

   public static void llenaMatriz() {
      int cont = 1;
      for (i = 0; i < m.length; i++) // filas
         for (j = 0; j < m[i].length; j++) // columnas
            m[i][j] = cont++;
   }

   public static void despliegaMatriz() {
      // desplegar m de forma matricial por filas
      for (i = 0; i < m.length; i++) { // filas
         for (j = 0; j < m[i].length; j++) // columnas
            System.out.print(m[i][j] + "  ");
         System.out.println();
      }
   }

   public static int sumaMatriz() {
      int suma = 0;
      for (i = 0; i < m.length; i++) // filas
         for (j = 0; j < m[i].length; j++) // columnas
            suma += m[i][j];
      System.out.println("\n");
      return suma;
   }

   public static void main(String args[]) {
      int f, c;
      Scanner scanner = new Scanner(System.in);
      // Leemos cantidad de filas y columnas
      System.out.println("Ingresa el numero de filas: ");
      f = scanner.nextInt();
      System.out.println("Ingresa el numero de columnas: ");
      c = scanner.nextInt();

      m = new int[f][c];
      llenaMatriz();
      despliegaMatriz();

      // // desplegar m por columnas
      // for (j = 0; j < m[0].length; j++) { // columnas
      // for (i = 0; i < m.length; i++) // filas
      // System.out.print(m[i][j] + " ");
      // System.out.println();
      // }
      System.out.println("\nSuma de datos de la matriz: " + sumaMatriz());
      System.out.println("\nContenido de casillas de m :" + Arrays.deepToString(m));
   }
}
