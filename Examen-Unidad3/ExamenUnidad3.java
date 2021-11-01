import java.util.Scanner;

public class ExamenUnidad3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        ColaLinealClientes filaA = new ColaLinealClientes(3);
        ColaCircularClientes filaB = new ColaCircularClientes(3);

        do {
            System.out.println("---MENU---");
            System.out.println("1.- Insertar cliente");
            System.out.println("2.- Mostrar clientes de la fila A");
            System.out.println("3.- Mostrar clientes de la fila B");
            System.out.println("4.- Eliminar cliente de la fila A");
            System.out.println("5.- Pasar clientes de la fila B a la fila A");
            System.out.println("6.- Suma total de saldos");
            System.out.println("7.- Aumentar saldo de clientes en la fila A");
            System.out.println("8.- Clientes de un tipo de cuenta");
            System.out.println("9.- Salir");
            opcion = entrada.nextInt();
            // Cola A = COLA LINEAL
            // COLA B = COLA CIRCULAR
            switch (opcion) {
            case 1:
                System.out.println("Ingresa en que fila quieres insertar el nuevo cliente\nFila A - 1\nFila B - 2");
                int opcionInsertar = entrada.nextInt();

                // if (opcionInsertar != 1 || opcionInsertar != 2) {
                // System.out.println("Esa opcion no existe");
                // break;
                // }

                if (opcionInsertar == 1) {
                    System.out.println("FILA A");
                    System.out.println("Ingresa el nombre del cliente");
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    System.out.println("Ingresa el tipo de cuenta\nOro - 1\nPlata - 2\nBronce - 3");
                    int tipoCuenta = entrada.nextInt();
                    String tipoCuentaString;
                    if (tipoCuenta == 1) {
                        tipoCuentaString = "Oro";
                    } else if (tipoCuenta == 2) {
                        tipoCuentaString = "Plata";
                    } else if (tipoCuenta == 3) {
                        tipoCuentaString = "Bronce";
                    } else {
                        System.out.println("Esa opcion no existe");
                        break;
                    }
                    System.out.println("Ingresa el saldo del cliente");
                    float saldo = entrada.nextFloat();
                    Cliente nuevoCliente = new Cliente(nombre, tipoCuentaString, saldo);
                    filaA.insertar(nuevoCliente);
                }

                if (opcionInsertar == 2) {
                    System.out.println("FILA B");
                    System.out.println("Ingresa el nombre del cliente");
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    System.out.println("Ingresa el tipo de cuenta\nOro - 1\nPlata - 2\nBronce - 3");
                    int tipoCuenta = entrada.nextInt();
                    String tipoCuentaString;
                    if (tipoCuenta == 1) {
                        tipoCuentaString = "Oro";
                    } else if (tipoCuenta == 2) {
                        tipoCuentaString = "Plata";
                    } else if (tipoCuenta == 3) {
                        tipoCuentaString = "Bronce";
                    } else {
                        System.out.println("Esa opcion no existe");
                        break;
                    }
                    System.out.println("Ingresa el saldo del cliente");
                    float saldo = entrada.nextFloat();
                    Cliente nuevoCliente = new Cliente(nombre, tipoCuentaString, saldo);
                    filaB.insertar(nuevoCliente);
                }

                break;
            case 2:
                System.out.println(filaA.toString());
                break;
            case 3:
                System.out.println(filaB.toString());
                break;
            case 4:
                filaA.eliminar();
                break;
            case 5:
                filaB.transferirBtoA(filaA, filaB);
                break;

            case 6:
                System.out.println("La suma total es las 2 filas es: " + (filaA.sumaSaldos() + filaB.sumarSaldos()));
                break;
            case 7:
                System.out.println("Ingresa el porcentaje a aumentar");
                float porcentaje = entrada.nextFloat();
                filaA.aumentarSaldo(porcentaje);
                break;
            case 8:
                System.out.println("Tipos de cuenta: \nOro\nPlata\nBronce");
                System.out.println("Ingresa el tipo de cuenta");
                entrada.nextLine();
                String tipoCuenta = entrada.nextLine();

                filaA.mostrarClientesPorTipoCuenta(tipoCuenta);
                filaB.mostrarClientesPorTipoCuenta(tipoCuenta);
                break;
            default:
                break;
            }
        } while (opcion != 9);
    }
}
