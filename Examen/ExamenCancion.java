
public class ExamenCancion {
    public static void main(String[] args) {
        int p[] = new int[3];

        p[0] = 1;
        p[1] = 2;
        p[2] = 3;
        p[-1] = 10;

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

    }
}
