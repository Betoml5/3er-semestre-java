public class Elipse {
    private float radioMayor;
    private float radioMenor;

    public Elipse() {
        radioMenor = radioMayor = 0;
    }

    public Elipse(float radioMayor, float radioMenor) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public float getRadioMayor() {
        return radioMayor;
    }

    public float getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMayor(float radioMayor) {
        this.radioMayor = radioMayor;
    }

    public void setRadioMenor(float radioMenor) {
        this.radioMenor = radioMenor;
    }

    public float calcularArea() {
        return (float) (3.1416 * this.radioMenor * this.radioMayor);
    }

    public float calcularPerimetro() {

        return (float) ((float) (2 * 3.1416)
                * Math.sqrt((Math.pow(this.radioMenor, 2) + Math.pow(this.radioMayor, 2)) / 2));

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "El radio menor es: " + this.getRadioMenor() + " y el radio mayor es: " + this.getRadioMenor();
    }
}
