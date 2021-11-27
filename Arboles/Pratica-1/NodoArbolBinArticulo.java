public class NodoArbolBinArticulo {

    // Equipo 5
    // Beto Martinez
    // Yahir Rivera
    // Brenda Rodriguez

    private NodoArbolBinArticulo izquierdo; // apuntador al hijo izquierdo
    private NodoArbolBinArticulo derecho; // apuntador al hijo derecho
    private String descripcion; // nodo con UN dato String
    private float precio;

    // Constructor: Crea nodos hoja
    public NodoArbolBinArticulo(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
        izquierdo = derecho = null;
    }

    // 3 get...
    public String getDescripcion() {
        return this.descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public NodoArbolBinArticulo getIzquierdo() {
        return izquierdo;
    }

    public NodoArbolBinArticulo getDerecho() {
        return derecho;
    }

    // 3 set..

    public void setIzquierdo(NodoArbolBinArticulo nuevoIzq) {
        izquierdo = nuevoIzq;
    }

    public void setDerecho(NodoArbolBinArticulo nuevoDer) {
        derecho = nuevoDer;
    }

    // toString
    public String toString() {
        return "El precio del articulo: " + this.descripcion + " es: $" + this.precio;
    }
}
