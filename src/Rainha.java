public class Rainha extends mae{
    String nome;
    int idade;
    int ovos;

    public Rainha(String nome, int idade, int ovos) {
        super(nome, idade);
        this.ovos = ovos;
    }

    @Override
    public void executarAtividade() {
        System.out.println(nome + "Botando ovos");
    }

    @Override
    public double calcularConsumo() {
        return 20 + (ovos * 0.01);
    }
}
