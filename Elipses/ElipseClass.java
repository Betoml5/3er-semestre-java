public class ElipseClass {
    private double radioMayor;
    private double radioMenor;

    public ElipseClass() {
        radioMenor = radioMayor = 0;
    }

    public ElipseClass(float radioMayor, float radioMenor) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    public float calcularArea() {
        return (float) (3.1416 * this.radioMenor * this.radioMayor);
    }

    public float calcularPerimetro() {

        return (float) ((float) (2 * 3.1416)
                * Math.sqrt((Math.pow(this.radioMenor, 2) + Math.pow(this.radioMayor, 2)) / 2));

    }

    // @Override
    // public String toString() {
    // // TODO Auto-generated method stub
    // return "El radio menor es: " + this.getRadioMenor() + " y el radio mayor es:
    // " + this.getRadioMenor();
    // }
}
