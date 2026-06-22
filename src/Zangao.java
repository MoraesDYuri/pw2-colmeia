public class Zangao extends mae {
    String nome;
    String defender;
    int idade;
    int voosAcasalamento;

    public Zangao(String nome, String defender, int idade, int voosAcasalamento) {
        super(nome, idade);
        this.voosAcasalamento = voosAcasalamento;
    }

    @Override
    public void executarAtividade() {System.out.println(nome + "Realizando voo de acasalamento");
    }

    @Override
    public double calcularConsumo() {return 15 + (voosAcasalamento * 3);
    }

    @Override
    public void executarCapacidade() {System.out.println(defender + "Defendendo a colméia");
    }

}
