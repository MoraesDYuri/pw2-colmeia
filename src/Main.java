import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<mae> colmeia = new ArrayList<>();

        colmeia.add(new Operaria("Mel", 30, 5));
        colmeia.add(new Operaria("Flor", 20, 3));
        colmeia.add(new Rainha("Queen", 200, 1000));
        colmeia.add(new Zangao("Zé", "Defesa", 40, 2));

        double consumoTotal = 0;

        for (mae abelha : colmeia) {

            abelha.exibirInformacoes();

            abelha.executarAtividade();

            double consumo = abelha.calcularConsumo();

            System.out.println("Consumo diário: " + consumo + "mg");

            consumoTotal += consumo;

            System.out.println("Consumo total: "
                    + consumoTotal + "mg");
        }
    }
}