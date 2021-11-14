public class U3_Practica3 {
    public static void main(String[] args) {
        ColaCircularEquipos colaEquipos = new ColaCircularEquipos(3);
        Equipo miEquipo1 = new Equipo("RositaFC", "amateur", 8);
        Equipo miEquipo2 = new Equipo("MuzquizFC", "semi-profesional", 15);
        Equipo miEquipo3 = new Equipo("SaltilloFC", "profesional", 8);

        colaEquipos.insertar(miEquipo1);
        colaEquipos.insertar(miEquipo2);
        colaEquipos.insertar(miEquipo3);
        // colaEquipos.eliminar();

        if (miEquipo1 == miEquipo2) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }

        System.out.println(colaEquipos.buscarEquipo("RositaFC"));
        System.out.println(colaEquipos.buscarEquipo("MuzquizFC"));
        System.out.println(colaEquipos.buscarEquipo("SaltilloFC"));
        // System.out.println(colaEquipos.equipoAmateur8_12());

        // System.out.println(colaEquipos.toString());
    }
}
