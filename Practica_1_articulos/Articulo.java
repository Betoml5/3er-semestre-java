
public class Articulo {
    private String descripcion;
    private int cantidad;
    private float precio;

    public Articulo(String descripcion, int cantidad, float precio) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo: " + this.descripcion + "\nCantidad: " + this.cantidad + "\nPrecio: " + this.precio;
    }
}
