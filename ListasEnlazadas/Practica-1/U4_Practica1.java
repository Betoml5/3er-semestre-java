
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
            System.out.println("3.- Mostrar medicos del 1er. turno");
            System.out.println("4.- Mostrar medicos del 2do. turno");
            System.out.println("5.- Buscar un doctor");
            System.out.println("6.- Lista de medicos por especialidad y por turno");
            System.out.println("7.- Suma de salarios de los 2 turnos");
            System.out.println("8.- Eliminar doctor por nombre");
            System.out.println("9.- Salir");

            opcion = entrada.nextInt();
            boolean correcto = true;
            switch (opcion) {
            case 1:
                System.out.println("Ingresa el nombre del doctor");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Ingresa la especialidad del doctor");
                System.out.println("--Especialidad a elegir--");
                System.out.println("*Cardiologia");
                System.out.println("*Pediatria");
                System.out.println("*Dermatologia");
                especialidad = entrada.nextLine();
                correcto = true;
                do {
                    if (especialidad.equals("Cardiologia") || especialidad.equals("Pediatria")
                            || especialidad.equals("Dermatologia")) {
                        correcto = false;
                    } else {
                        System.out.println("Esa especialidad no esta en las opciones, ingresa otra");
                        especialidad = entrada.nextLine();
                    }
                } while (correcto);
                System.out.println("Ingresa el sueldo del doctor");
                sueldo = entrada.nextFloat();
                turno1.insertaAlfabetico(new NodoDoctor(new Doctor(nombre, especialidad, sueldo)));
                break;
            case 2:
                System.out.println("Ingresa el nombre del doctor");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Ingresa la especialidad del doctor");
                System.out.println("--Especialidad a elegir--");
                System.out.println("*Cardiologia");
                System.out.println("*Pediatria");
                System.out.println("*Dermatologia");
                especialidad = entrada.nextLine();
                correcto = true;
                do {
                    if (especialidad.equals("Cardiologia") || especialidad.equals("Pediatroa")
                            || especialidad.equals("Dermatologia")) {
                        correcto = false;
                    } else {
                        System.out.println("Esa especialidad no est� en las opciones, ingresa otra");
                        especialidad = entrada.nextLine();
                    }
                } while (correcto);
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
                System.out.println("Ingresa el n�mero de especialidad que deseas colsultar");
                System.out.println("--Especialidad a elegir--");
                System.out.println("*Cardiologia");
                System.out.println("*Pediatria");
                System.out.println("*Dermatologia");
                String esp = entrada.nextLine();
                correcto = true;
                do {
                    if (esp.equals("Cardiolog�a") || esp.equals("Pediatr�a") || esp.equals("Dermatolog�a")) {
                        correcto = false;
                    } else {
                        System.out.println("Esa especialidad no est� en las opciones, ingresa otra");
                        esp = entrada.nextLine();
                    }
                } while (correcto);

                int t = 0;
                do {
                    System.out.println("Ingresa el n�mero de turno que deseas consultar");
                    t = entrada.nextInt();
                } while (t <= 0 || t >= 3);
                switch (t) {
                case 1:
                    if (turno1.listaVacia()) {
                        System.out.println("NO HAY DATOS EN EL TURNO 1");
                    } else {
                        System.out.println("TURNO 1");
                        System.out.println(turno1.medicoEspecialidad(esp));
                    }
                    break;
                case 2:
                    if (turno2.listaVacia()) {
                        System.out.println("NO HAY DATOS EN EL TURNO 2");
                    } else {
                        System.out.println("TURNO 2");
                        System.out.println(turno2.medicoEspecialidad(esp));
                    }
                    break;
                default:

                    break;
                }
                break;
            case 7:
                System.out.println(turno1.sumaSueldos());
                break;

            case 8:
                System.out.println("Ingresa el nombre del doctor");
                entrada.nextLine();
                nombre = entrada.nextLine();
                turno1.eliminarPorNombre(nombre);

                break;
            case 9:
                opcion = 9;
                break;
            default:

                break;
            }

        } while (opcion != 9);

    }
}
