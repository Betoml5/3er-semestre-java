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

        // int index = palabra.length();
        // int aux = 0;
        // while (index != 0) {
        // pilaChar1.insertar(palabra.charAt(index));
        // pilaChar2.insertar(palabra.charAt(index + 1));
        // pilaChar3.insertar(palabra.charAt(index + 2));
        // index = index - (pilaChar1.numElementos() + pilaChar2.numElementos() +
        // pilaChar3.numElementos());
        // }
        // int aux = 0;
        // for (int i = 0; i < palabra.length() - 2; i = pilaChar1.numElementos() +
        // pilaChar2.numElementos()
        // + pilaChar3.numElementos()) {
        // pilaChar1.insertar(palabra.charAt(i));
        // pilaChar2.insertar(palabra.charAt(i + 1));
        // pilaChar3.insertar(palabra.charAt(i + 2));
        // aux = pilaChar1.numElementos() + pilaChar2.numElementos()
        // + pilaChar3.numElementos();
        // }

        for (int i = 0; i < palabra.length(); i++) {
            int resto = i % 3;
            if (resto == 0) {
                pilaChar1.insertar(palabra.charAt(i));
            } else if (resto == 1) {
                pilaChar2.insertar(palabra.charAt(i));
            } else {
                pilaChar3.insertar(palabra.charAt(i));
            }
        }

        

        System.out.println(Arrays.toString(pilaChar1.getP()));
        System.out.println(Arrays.toString(pilaChar2.getP()));
        System.out.println(Arrays.toString(pilaChar3.getP()));

    }
}
