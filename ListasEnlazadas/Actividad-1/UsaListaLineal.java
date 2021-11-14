import javax.swing.JOptionPane;

public class UsaListaLineal {
	// Equipo
	// Beto Martinez
	// Yahir Rivera
	// Brenda Rodriguez

	public static void main(String args[]) {
		// declara y crea una LISTA lineal de alumnos (string:nombre y float:calif)
		ListaLineal grupo = new ListaLineal();

		int opcion;
		String nombre;
		float calif;

		String menu = " OPCIONES PARA UNA LISTA LINEAL DE ALUMNOS \n\n";
		menu += "1. Insertar un alumno (al inicio) \n";
		menu += "2. Mostrar lista de alumnos \n";
		menu += "3. Alumno del inicio \n";
		menu += "4. Cantidad de alumnos \n";
		menu += "5. Promedio de alumnos \n";
		menu += "6. Lista de alumnos reprobados \n";
		menu += "7. Agregar 10 puntos a un alumno \n";
		menu += "8. Salir \n";

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {

			case 1:
				nombre = JOptionPane.showInputDialog("Nombre del alumno:");
				calif = Float.parseFloat(JOptionPane.showInputDialog("Calif. del alumno:"));
				grupo.insertaInicio(new Nodo(nombre, calif));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, grupo.toString());
				// grupo.recorreLista();
				break;
			case 3:
				if (!grupo.listaVacia())
					JOptionPane.showMessageDialog(null,
							"Nombre del alumno del inicio: " + grupo.getInicio().getDato1());
				else
					JOptionPane.showMessageDialog(null, "No hay alumnos");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Hay " + grupo.getNumNodos() + " alumnos");
				break;
			case 5:
				if (!grupo.listaVacia())
					JOptionPane.showMessageDialog(null, "Promedio del grupo: " + grupo.promedio());
				else
					JOptionPane.showMessageDialog(null, "No hay alumnos");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, grupo.alumnosReprobados());
				break;
			case 7:
				String nombreAlumno = JOptionPane.showInputDialog(null, "Ingresa el nombre del alumno");
				grupo.agregarPuntos(nombreAlumno);
				break;
			case 8:
				System.out.println("Salimos del programa");
				break;
			}
		} while (opcion != 8);
	}
}
