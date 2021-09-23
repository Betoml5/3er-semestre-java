import javax.swing.JOptionPane;

//Equipo
//Beto Martinez
//Yahir Rivera
//Brenda Rodriguez

public class U2Actividad1 {

	public static void main(String args[]) {
		// declara y crea una pila de 5 casillas
		PilaString pilita = new PilaString(10); // se usa el 1er constructor
		int num, opcion;

		String menu = " OPCIONES PARA UNA PILA DE ENTEROS \n\n";
		menu += "1. Insertar una ciudad \n";
		menu += "2. Mostrar pilas de ciudades \n";
		menu += "3. Eliminar una ciudad \n";
		menu += "4. Cuantas ciudades hay actualmente en la pila \n";
		menu += "5. Salir \n";

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {

				case 1:
					if (!pilita.estaLlena()) {
						String str = JOptionPane.showInputDialog("Ciudad a insertar en la pila");
						pilita.insertar(str); // num leido del teclado, se inserta en la pila
					} else {
						JOptionPane.showMessageDialog(null, "PILA LLENA. No se puede insertar");
					}

					break;
				case 2:
					JOptionPane.showMessageDialog(null, pilita.toString());
					break;
				case 3:
					if (!pilita.estaVacia())
						JOptionPane.showMessageDialog(null, "Dato eliminado: " + pilita.eliminar());
					else
						JOptionPane.showMessageDialog(null, "PILA VACIA. No se puede eliminar");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Hay " + pilita.numElementos() + " datos en la pila");
					break;
				case 5:
					opcion = 5;
					break;
				default:

					JOptionPane.showMessageDialog(null, ("Opción no válida"));
					break;
			}
		} while (opcion != 5);
	}
}