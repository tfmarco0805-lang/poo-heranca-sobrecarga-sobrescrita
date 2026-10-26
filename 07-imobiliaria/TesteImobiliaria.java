public class TesteImobiliaria {
    public static void main(String[] args) {
        Imovel[] v = new Imovel[2];
        v[0] = new Casa("Rua A, 10", 80, 3);
        v[1] = new Apartamento("Rua B, 200", 60, 5);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].descrever());
        }

        System.out.println(v[0].valorEstimado(3000));
        System.out.println(v[0].valorEstimado(3000, 2000));
    }
}
