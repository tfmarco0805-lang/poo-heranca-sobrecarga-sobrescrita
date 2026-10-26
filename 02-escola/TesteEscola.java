public class TesteEscola {
    public static void main(String[] args) {
        Funcionario[] v = new Funcionario[2];
        v[0] = new Professor("Ana", 3000, "POO");
        v[1] = new Coordenador("Bruno", 4500, "Pedagogico");

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].descrever());
        }

        System.out.println(v[0].bonificacao());
        System.out.println(v[0].bonificacao(20));
    }
}
