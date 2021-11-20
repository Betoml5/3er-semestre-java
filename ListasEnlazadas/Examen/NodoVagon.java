public class NodoVagon {
    private String carga;
    private float peso;
    private NodoVagon enlace;

    public NodoVagon(String carga, float peso) {
        this.carga = carga;
        this.peso = peso;
        this.enlace = null;
    }

    public String getCarga() {
        return carga;
    }

    public NodoVagon getEnlace() {
        return enlace;
    }

    public float getPeso() {
        return peso;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public void setEnlace(NodoVagon enlace) {
        this.enlace = enlace;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Carga: " + this.carga + " con peso de: " + this.peso + " Toneladas";
    }

}
