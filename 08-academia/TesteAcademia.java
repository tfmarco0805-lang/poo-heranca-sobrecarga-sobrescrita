public class TesteAcademia {
    public static void main(String[] args) {
        Atleta[] v = new Atleta[2];
        v[0] = new Corredor("Lia", 10);
        v[1] = new Nadador("Paulo", "crawl");

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].apresentar());
        }

        System.out.println(v[0].registrarTempo(55.2));
        System.out.println(v[0].registrarTempo(58, "100m"));
    }
}
