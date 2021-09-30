import java.net.PasswordAuthentication;
import java.util.Arrays;
import java.util.Scanner;

public class MensajeSecreto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        System.out.println("Ingresa tu palabra");
        palabra = entrada.nextLine();
        System.out.println("Tu palabra es: " + palabra);
        PilaChar pilaChar1 = new PilaChar(palabra.length());
        PilaChar pilaChar2 = new PilaChar(palabra.length());
        PilaChar pilaChar3 = new PilaChar(palabra.length());

        for (int i = 0; i < palabra.length() - 2; i = pilaChar1.numElementos() + pilaChar2.numElementos()
                + pilaChar3.numElementos()) {
            pilaChar1.insertar(palabra.charAt(i));
            pilaChar2.insertar(palabra.charAt(i + 1));
            pilaChar3.insertar(palabra.charAt(i + 2));
        }

        System.out.println(Arrays.toString(pilaChar1.getP()));
        System.out.println(Arrays.toString(pilaChar2.getP()));
        System.out.println(Arrays.toString(pilaChar3.getP()));

        char auxArray[] = new char[pilaChar1.numElementos() + pilaChar2.numElementos() + pilaChar3.numElementos()];

        for (int i = pilaChar1.getTope(); i >= 0; i++) {
            auxArray[i] = pilaChar1.eliminar();
            auxArray[i + 1] = pilaChar1.eliminar();
        }

        System.out.println(Arrays.toString(pilaChar1.getP()));
        System.out.println(Arrays.toString(pilaChar2.getP()));
        System.out.println(Arrays.toString(pilaChar3.getP()));

        // System.out.println(pilaChar1.toString());
        // System.out.println(pilaChar2.toString());
        // System.out.println(pilaChar3.toString());

    }
}
