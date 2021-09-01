/* Clase INSTANCIABLE para manejar 
 * objetos: triángulos
 */

public class Triangulo {
    // atributos
    private float lado1;
    private float lado2;
    private float lado3;

    // constructores
    public Triangulo() {
        lado1 = lado2 = lado3 = 0;
    }

    public Triangulo(float l1, float l2, float l3) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    public Triangulo(float lad) {
        lado1 = lado2 = lado3 = lad;
    }

    // getters
    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    // setters
    public void setLado1(float nuevoLado1) {
        lado1 = nuevoLado1;
    }

    public void setLado2(float nuevoLado2) {
        lado2 = nuevoLado2;
    }

    public void setLado3(float nuevoLado3) {
        lado3 = nuevoLado3;
    }

    // toString heredado de la clase Object
    public String toString() {
        String s = "";
        s += "\nlado1: " + lado1;
        s += "\nlado2: " + lado2;
        s += "\nlado3: " + lado3;
        return s;
    }

    // calcula y devuelve el perÌmetro
    public float calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // calcula y devuelve el área
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;
    }

} // fin de la clase