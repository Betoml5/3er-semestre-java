import javax.swing.JOptionPane;

public class UsaArbolBinario {

    public static void main(String args[]) {
        // declara y crea un árbol binario ordenado VACIO
        ArbolBinario tree = new ArbolBinario();
        int opcion;
        String palabra;

        String menu = " OPCIONES PARA UN ARBOL BINARIO ORDENADO \n\n";
        menu += "1. Insertar una palabra \n";
        menu += "2. Mostrar palabras PREORDEN \n";
        menu += "3. Mostrar palabras INORDEN \n";
        menu += "4. Mostrar palabras POSTORDEN \n";
        menu += "5. Numero de nodos \n";
        menu += "6. Datos en las hojas del arbol \n";
        menu += "7. Salir \n";

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
            case 1:
                palabra = JOptionPane.showInputDialog("Palabra a insertar en el árbol:");
                tree.insertarNodo(new NodoArbolBin(palabra));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Recorrido PREorden:\n\n" + tree.preorden(tree.getRaiz()));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Recorrido INorden:\n\n" + tree.inorden(tree.getRaiz()));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Recorrido POSTorden:\n\n" + tree.postorden(tree.getRaiz()));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Numero de nodos " + tree.numNodos(tree.getRaiz()));
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Datos de las hojas del arbol " + tree.hojas(tree.getRaiz()));
                break;
            case 7:
                opcion = 7;
                break;

            default:
                JOptionPane.showMessageDialog(null, ("Opción no válida"));
                break;
            }
        } while (opcion != 7);
    }
}
