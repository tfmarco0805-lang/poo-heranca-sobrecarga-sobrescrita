public class TestePetShop {
    public static void main(String[] args) {
        Animal[] v = new Animal[2];
        v[0] = new Cachorro("Rex", 3, "Labrador");
        v[1] = new Gato("Mia", 2, "curta");

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].descrever());
        }

        System.out.println(v[0].idadeEmMeses());
        System.out.println(v[0].idadeEmMeses(6));
    }
}
