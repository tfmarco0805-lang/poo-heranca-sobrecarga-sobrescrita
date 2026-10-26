public class TesteTransporte {
    public static void main(String[] args) {
        Transporte[] v = new Transporte[2];
        v[0] = new Van("Centro", 15);
        v[1] = new OnibusEscolar("Bairro", 2);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].anunciar());
        }

        System.out.println(v[0].lotacao(12));
        System.out.println(v[0].lotacao(12, 15));
    }
}
