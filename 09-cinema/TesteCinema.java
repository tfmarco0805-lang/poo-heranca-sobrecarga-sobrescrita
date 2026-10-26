public class TesteCinema {
    public static void main(String[] args) {
        Ingresso[] v = new Ingresso[2];
        v[0] = new MeiaEntrada("Divertida Mente", 40, "carteira 123");
        v[1] = new Vip("Duna", 40, "A");

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].valorFinal());
        }

        System.out.println(v[0].resumo());
        System.out.println(v[0].resumo(true));
    }
}
