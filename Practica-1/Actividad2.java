import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Elipse[] elipses = new Elipse[7];
        float sumaDeAreas = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Vuelta: " + i);

            System.out.println("Ingresa el valor del radio mayor: ");
            float radioMayor = entrada.nextFloat();
            System.out.println("Ingresa el valor del radio menor: ");
            float radioMenor = entrada.nextFloat();

            elipses[i] = new Elipse(radioMayor, radioMenor);

        }

        // elipses[4] = elipses[0];
        // System.out.println("ELIPSE 4: " + elipses[4].getRadioMayor() + " " +
        // elipses[4].getRadioMenor());
        // float perimetroMayor = 0;
        // int indiceMayor = 0;
        // for (int i = 0; i < elipses.length; i++) {
        // if (elipses[i] != null) {
        // if (elipses[i].calcularPerimetro() > perimetroMayor) {
        // perimetroMayor = elipses[i].calcularPerimetro();
        // indiceMayor = i;
        // }
        // }
        // }
        // System.out.println("Indice mayor: " + indiceMayor);
        // System.out.println("Perimetro mayor: " + perimetroMayor);

        // for (int i = 0; i < elipses.length; i++) {
        // if (elipses[i] != null) {
        // sumaDeAreas += elipses[i].calcularArea();
        // } else {
        // sumaDeAreas += 0;
        // }
        // }

        // System.out.println("Suma de areas: " + sumaDeAreas);

        // elipses[2] = null;
        // System.out.println(elipses[2]);

        elipses[6] = new Elipse(20, 10);

        System.out.println("Elipse 6 antes: " + elipses[6].getRadioMayor() + " " + elipses[6].getRadioMenor());

        elipses[6].setRadioMayor(15.00);
        elipses[6].setRadioMenor(4.87);

        System.out.println("Elipse 6 antes: " + elipses[6].getRadioMayor() + " " + elipses[6].getRadioMenor());

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
