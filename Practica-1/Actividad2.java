import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Elipse[] elipses = new Elipse[7];

        for (int i = 0; i < elipses.length; i++) {
            System.out.println("Vuelta: " + i);
            if (i < 3) {
                System.out.println("Ingresa el valor del radio mayor: ");
                float radioMayor = entrada.nextFloat();
                System.out.println("Ingresa el valor del radio menor: ");
                float radioMenor = entrada.nextFloat();

                elipses[i] = new Elipse(radioMayor, radioMenor);
            } else {
                elipses[i] = new Elipse();
            }

        }

        elipses[6] = new Elipse();

        // Mostramos array
        for (int i = 0; i < elipses.length; i++) {
                System.out.println("Area: " + elipses[i].calcularArea());
                System.out.println("Perimetro: " + elipses[i].calcularPerimetro());
                System.out.println(elipses[i].toString());
        }
    }
}
