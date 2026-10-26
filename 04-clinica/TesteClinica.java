public class TesteClinica {
    public static void main(String[] args) {
        Pessoa[] v = new Pessoa[2];
        v[0] = new Paciente("Carla", "Unimed");
        v[1] = new Medico("Diego", "Clinica");

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].ficha());
        }

        System.out.println(v[0].agendar("12/10/2026"));
        System.out.println(v[0].agendar("12/10/2026", "14:00"));
    }
}
