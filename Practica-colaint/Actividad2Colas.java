public class Actividad2Colas {
    public static void main(String[] args) {
        ColaLibros colaLib = new ColaLibros(5);
        Libro miLibro = new Libro("Harry", "Octavio Paz", 100, 200);
        Libro miLibro1 = new Libro("Harry2", "Octavio Pas", 100, 200);
        Libro miLibro2 = new Libro("Harr3", "Octavio Pa3", 100, 200);

        colaLib.insertar(miLibro);
        colaLib.insertar(miLibro1);
        colaLib.insertar(miLibro2);

        colaLib.modificaPrecio();
        // System.out.println(colaLib.titulosAutores());
        System.out.println(colaLib.toString());
    }
}
