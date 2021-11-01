import java.util.Scanner;

public class U4_Practica1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombre;
        String especialidad;
        float sueldo;

        ListaDoctores turno1 = new ListaDoctores();
        ListaDoctores turno2 = new ListaDoctores();

        do {
            System.out.println("-- MENU -- ");
            System.out.println("SELECCIONA CON LOS NUMEROS");
            System.out.println("1.- Dar de dalto a un medico en el turno 1");
            System.out.println("2.- Dar de dalto a un medico en el turno 2");
            System.out.println("3.- Mostrar médicos del 1er. turno");
            System.out.println("4.- Mostrar médicos del 2do. turno");
            System.out.println("5.- Buscar un doctor");
            System.out.println("6.- Lista de médicos por especialidad y por turno");
            System.out.println("7.- Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("Ingresa el nombre del doctor");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Ingresa la especialidad del doctor");
                especialidad = entrada.nextLine();
                System.out.println("Ingresa el sueldo del doctor");
                sueldo = entrada.nextFloat();
                turno1.insertaInicio(new NodoDoctor(new Doctor(nombre, especialidad, sueldo)));
                break;
            case 2:
                System.out.println("Ingresa el nombre del doctor");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Ingresa la especialidad del doctor");
                especialidad = entrada.nextLine();
                System.out.println("Ingresa el sueldo del doctor");
                sueldo = entrada.nextFloat();
                turno2.insertaInicio(new NodoDoctor(new Doctor(nombre, especialidad, sueldo)));
                break;
            case 3:
                System.out.println(turno1.toString());
                break;
            case 4:
                System.out.println(turno2.toString());
                break;
            case 5:
                System.out.println("Ingresa el nombre del doctor");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println(turno1.buscarDoctor(nombre) + " TURNO 1");
                System.out.println(turno2.buscarDoctor(nombre) + " TURNO 2");

                break;
            case 6:
                break;

            case 7:
                opcion = 7;
                break;

            default:
                System.out.println("Esa opcion no existe");
                break;
            }

        } while (opcion != 7);

    }
}
