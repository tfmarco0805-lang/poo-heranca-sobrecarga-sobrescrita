public class TestePapelaria {
    public static void main(String[] args) {
        Produto[] v = new Produto[2];
        v[0] = new Caderno("Universitario", 20, 96);
        v[1] = new Caneta("Bic", 5, "azul");

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].descrever());
        }

        System.out.println(v[0].precoComDesconto(10));
        System.out.println(v[0].precoComDesconto(90, 8));
    }
}
