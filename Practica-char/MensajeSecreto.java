import java.net.PasswordAuthentication;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.PasteAction;

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

        int numElementos = pilaChar1.numElementos() + pilaChar2.numElementos() + pilaChar3.numElementos();
        String finalWord = "";
        for (int i = 0; i < numElementos; i++) {
            if (pilaChar1.numElementos() >= 2) {
                finalWord += pilaChar1.eliminar();
                finalWord += pilaChar1.eliminar();
            } else if (pilaChar1.numElementos() > 0) {
                finalWord += pilaChar1.eliminar();
            }

            if (pilaChar2.numElementos() >= 2) {
                finalWord += pilaChar2.eliminar();
                finalWord += pilaChar2.eliminar();
            } else if (pilaChar2.numElementos() > 0) {
                finalWord += pilaChar2.eliminar();
            }

            if (pilaChar3.numElementos() >= 2) {
                finalWord += pilaChar3.eliminar();
                finalWord += pilaChar3.eliminar();
            } else if (pilaChar3.numElementos() > 0) {
                finalWord += pilaChar3.eliminar();
            }
        }

        // finalWord = 'x' + finalWord;

        // if (finalWord.endsWith("a") | finalWord.endsWith("e") |
        // finalWord.endsWith("i") | finalWord.endsWith("o")
        // | finalWord.endsWith("u")) {
        // finalWord = finalWord + '%';
        // } else {
        // finalWord = finalWord + '#';
        // }

        String filterWord = agregarCaracter(finalWord);

        System.out.println(filterWord);

    }

    public static String agregarCaracter(String palabra) {
        palabra = 'x' + palabra;
        if (palabra.endsWith("a") | palabra.endsWith("e") | palabra.endsWith("i") | palabra.endsWith("o")
                | palabra.endsWith("u") | palabra.endsWith("á") | palabra.endsWith("é") | palabra.endsWith("í")
                | palabra.endsWith("ó") | palabra.endsWith("ú")) {
            palabra = palabra + '%';
        } else {
            palabra = palabra + '#';
        }

        return palabra;

    }
}
