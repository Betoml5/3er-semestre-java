public class App {
    public static void main(String[] args) {
        Nodo miNodo = new Nodo("Luis", 10);
        ListaCircular miLista = new ListaCircular(miNodo);

        System.out.println(miLista.toString());

    }
}
