
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Equipo
// Beto Martinez
// Yahir Rivera
// Brenda Rodriguez

public class Practica2 {
	static int matriz[][];

	public static void generarMatriz(int n) {
		matriz = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				Random random = new Random();
				int numero = (random.nextInt(101) - 50);
				matriz[i][j] = numero;
			}
		}
	}

	public static void desplegarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] + "  ");
			System.out.println();
		}
	}

	public static void sumaMatriz() {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				suma += matriz[i][j];
		}
		System.out.println("La suma de todos los elementos de la matriz es: " + suma);

	}

	public static void sustituir() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				if (matriz[i][j] < 0) {
					matriz[i][j] = 0;
				}
		}
	}

	public static void mayor() {
		String salida = "";
		int mayor = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				if (matriz[i][j] > mayor) {
					mayor = matriz[i][j];
					salida = "El elemento mayor es: " + mayor + " En la posici�n [" + i + "][" + j + "]";
				}
		}
		System.out.println(salida);
	}

	public static void diagonal() {
		int j = 0, suma = 0;
		String salida = "la suma de la diagonal: ";
		for (int i = 0; i < matriz.length; i++) {
			salida += matriz[i][j] + " ";
			suma += matriz[i][j];
			j++;
		}
		salida += "de resultado: " + suma;
		System.out.println(salida);
	}

	public static void cambiarColumnas(int indice_1, int indice_2) {
		// for (int i = 0; i < matriz.length; i++) {
		// System.out.println("Columna 1: " + matriz[i][indice_1]);
		// }
		// for (int i = 0; i < matriz.length; i++) {
		// System.out.println("Columna 2: " + matriz[i][indice_2]);
		// }
		int holdingArray[] = new int[matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			holdingArray[i] = matriz[i][indice_1];
		}
		for (int i = 0; i < holdingArray.length; i++) {
			System.out.println(holdingArray[i]);
		}
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][indice_1] = matriz[i][indice_2];
			matriz[i][indice_2] = holdingArray[i];
		}
	}

	static int myArray[][] = { { 1, 3, 5, 7 }, { 5, 4, 1, 16 }, { 7, 9, 61, 13 } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean salir = true;
		boolean creada = false;
		do {
			Scanner entrada = new Scanner(System.in);
			System.out.println("- - - - - - - - - - - - - - Men� - - - - - - - - - - - - - -");
			System.out.println("- - - Escribe el n�mero de la opci�n que quieres hacer - - -");
			System.out.println("1. Generar matriz");
			System.out.println("2. Desplegar matriz");
			System.out.println("3. Sumar datos de la matriz");
			System.out.println("4. Sustituir negativos por 0's");
			System.out.println("5. Elemento mayor");
			System.out.println("6. Suma de la diagonal principal");
			System.out.println("7. Intercambiar columnas");
			System.out.println("8. Salir");

			int elec = entrada.nextInt();
			switch (elec) {

				case 1:
					System.out.println("Ingresar un valor entero para gener la matriz");
					int n = entrada.nextInt();
					generarMatriz(n);
					creada = true;
					break;
				case 2:
					if (creada) {
						desplegarMatriz();
					} else {
						System.out.println("No hay matriz para mostrar");
					}
					break;
				case 3:
					if (creada) {
						sumaMatriz();
					} else {
						System.out.println("No hay matriz para mostrar");
					}
					break;
				case 4:
					sustituir();
					break;
				case 5:
					mayor();
					break;
				case 6:
					diagonal();
					break;
				case 7:
					System.out.println("Ingresa el primer indice de la columna: ");
					int indice_1 = entrada.nextInt();
					System.out.println("Ingresa el primer indice de la columna: ");
					int indice_2 = entrada.nextInt();
					cambiarColumnas(indice_1, indice_2);
					break;
				case 8:
					salir = false;
					break;
			}

		} while (salir);

	}

}
