import java.util.Arrays;

public class AppElipses {

    public static void main(String[] args) {
        Elipse[] Arregloelipses = new Elipse[7];

        Arregloelipses[0] = new Elipse(15, 14);
        Arregloelipses[1] = new Elipse(16, 14);
        Arregloelipses[2] = new Elipse(112, 14);
        Arregloelipses[3] = new Elipse(1315, 14);
        Arregloelipses[4] = new Elipse(1235, 14);

        System.out.println(Arrays.toString(Arregloelipses));

    }
}
