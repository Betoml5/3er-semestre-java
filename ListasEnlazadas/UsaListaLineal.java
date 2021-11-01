import java.util.Scanner;

public class UsaListaLineal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaLineal grupo = new ListaLineal();
        int opcion;
        String nombre;
        float calificacion;

        System.out.println("Menu");
        System.out.println("1.- Insertar alumno al inicio");
        System.out.println("2.- Mostrar lista de alumnos");
        System.out.println("3.- Alumno del inicio");
        System.out.println("4.- Cantidad de alumnos");
        System.out.println("5.- Salir");
        opcion = entrada.nextInt();

        do {
            switch (opcion) {
            case 1:
                System.out.println("Ingresa el nombre del alumno");
                nombre = entrada.nextLine();
                System.out.println("Ingresa la calificacion");
                calificacion = entrada.nextFloat();
                grupo.insertaInicio(new Nodo(nombre, calificacion));
                break;
            case 2:
                grupo.recorreLista();
                break;
            default:
                break;
            }
        } while (opcion != 5);
    }
}
