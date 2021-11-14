import javax.swing.JOptionPane;

/* CLASE INSTANCIABLE PARA MANEJAR UNA LISTA ENLAZADA LINEAL Ó SIMPLE La lista que vamos
 a estar manejando tiene 2 atributos:
- el apuntador al primer nodo (inicio) del mismo tipo de la clase anterior Nodo
- un contador de nodos (numNodos) que SIEMPRE va a ser ENTERO */

public class ListaLineal {
  // Atributos
  private Nodo inicio;
  private int numNodos;

  // Constructor para crear una lista vacía
  public ListaLineal() {
    inicio = null;
    numNodos = 0;
  }

  // get...
  public Nodo getInicio() {
    return inicio;
  }

  public int getNumNodos() {
    return numNodos;
  }

  // faltan los set..

  // Método que devuelve true si la lista está vacía
  public boolean listaVacia() {
    if (inicio == null)
      return true;
    else
      return false;
  }

  // Método que inserta un nodo al inicio de la lista
  public void insertaInicio(Nodo nuevo) {
    nuevo.setEnlace(inicio);
    inicio = nuevo;
    numNodos++;
  }

  // Método que recorre la lista y despliega en pantalla los datos de los nodos
  public void recorreLista() {
    Nodo r = inicio;
    System.out.print("Empieza la lista:\n");
    while (r != null) {
      System.out.print(r.toString() + "\n");
      r = r.getEnlace();
    }
    System.out.println("Fin de la lista");
  }

  // calcular promedio del dato 2 de los nodos
  public float promedio() {
    Nodo r = inicio;
    float suma = 0;

    while (r != null) {
      suma += r.getDato2(); // sumar el datos 2 de cada nodo
      r = r.getEnlace(); // avanzar al sig. nodo
    }
    return (suma / numNodos); // se calcula el promedio
  }

  public String alumnosReprobados() {
    String s = "";
    if (!listaVacia()) {
      Nodo r = inicio;
      while (r != null) {
        if (r.getDato2() < 70) {
          s += "Alumno: " + r.getDato1();
        }
        r = r.getEnlace(); // avanzar al sig. nodo
      }
      return s;
    } else {
      return "La lista esta vacia";
    }
  }

  public void agregarPuntos(String nombreAlumno) {
    if (!listaVacia()) {
      Nodo r = inicio;
      while (r != null) {
        if (r.getDato1().equals(nombreAlumno) && r.getDato2() <= 90) {
          r.setDato2(r.getDato2() + 10);
        }
        r = r.getEnlace(); // avanzar al sig. nodo
      }
    } else {
      JOptionPane.showMessageDialog(null, "No hay elementos en la lista");
    }
  }

  // Metodo toString
  public String toString() {
    Nodo r = inicio;
    String s = "";
    while (r != null) {
      s += r.toString() + "\n";
      r = r.getEnlace(); // avanzar al sig. nodo
    }
    return s;
  }

  // faltan muchos más métodos
}