public class TesteLanchonete {
    public static void main(String[] args) {
        Item[] v = new Item[2];
        v[0] = new Lanche("X-burguer", 18, 2);
        v[1] = new Bebida("Suco", 8, 300);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].descrever());
        }

        System.out.println(v[0].total());
        System.out.println(v[0].total(2));
    }
}
