public class Operaria extends mae{
    String nome;
    int idade;
    int horasVoo;

    public Operaria(String nome, int idade, int horasVoo) {
        super(nome, idade);
        this.horasVoo = horasVoo;
    }

    @Override
    public void executarAtividade() {
        System.out.println(nome + "Coletando néctar");
    }

    @Override
    public double calcularConsumo() {
        return 10 + (horasVoo * 2);
    }

    @Override
    public void executarCapacidade() {System.out.println(nome + "Defendendo a colméia");
    }
}