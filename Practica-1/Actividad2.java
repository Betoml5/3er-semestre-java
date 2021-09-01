import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Elipse[] elipses = new Elipse[7];

        for (int i = 0; i < 3; i++) {
            System.out.println("Vuelta: " + i);

            System.out.println("Ingresa el valor del radio mayor: ");
            float radioMayor = entrada.nextFloat();
            System.out.println("Ingresa el valor del radio menor: ");
            float radioMenor = entrada.nextFloat();

            elipses[i] = new Elipse(radioMayor, radioMenor);

        }

        elipses[6] = new Elipse();

        // Mostramos array
        for (int i = 0; i < elipses.length; i++) {
            if (elipses[i] != null) {
                System.out.println("Elipse: " + (i + 1));
                System.out.println("Area: " + elipses[i].calcularArea());
                System.out.println("Perimetro: " + elipses[i].calcularPerimetro());
                System.out.println(elipses[i].toString());
                System.out.println("--------------------------------------");
            } else {
                System.out.println("EL ELIPSE " + (i + 1) + " NO EXISTE");
            }
        }
    }
}
