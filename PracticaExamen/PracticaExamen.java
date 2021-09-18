import java.util.Arrays;

public class PracticaExamen {
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Ingresa el tamano de la matriz");
        int n = entrada.nextInt();
        int myArray[][] = new int[n][];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new int[i + 1];
            int k = 1; // 
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = k + i;
                k++;
            }
        }   


        for (int i = 0; i < myArray.length; i++) {
            
        }


        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++)
                System.out.print(myArray[i][j] + "  ");
            System.out.println();
        }

        // System.out.println(Arrays.deepToString(myArray));
    }
}
