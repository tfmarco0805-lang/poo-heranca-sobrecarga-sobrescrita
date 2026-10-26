public class TesteBiblioteca {
    public static void main(String[] args) {
        Publicacao[] v = new Publicacao[2];
        v[0] = new Livro("Dom Casmurro", 1899, 256);
        v[1] = new Revista("Ciencia Hoje", 2024, 301);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].citar());
        }

        System.out.println(v[0].emprestar(7));
        System.out.println(v[0].emprestar(7, "Ana"));
    }
}
