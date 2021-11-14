public class Vuelo {
    private String ciudadOrigen, ciudadDestino;
    private float precio;

    public Vuelo(String ciudadOrigen, String ciudadDestino, float precio) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
    }

    public Vuelo() {

    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El vuelo con origen en la ciudad: " + this.ciudadOrigen + ". Y con destino a: " + this.ciudadDestino
                + " tiene un precio de: " + this.precio;
    }

}
