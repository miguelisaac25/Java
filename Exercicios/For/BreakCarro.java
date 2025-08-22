package Exercicios.For;

public class BreakCarro {
    // Dado o valor de um carro, descubra em quantas x ele pode ser parcelado
    // Condição: valorParcela >= 1000

    public static void main(String[] args) {
        double valorCarro = 83000;
        int maxParcelas = (int) (valorCarro / 1000);

        for (int parcela = 1; parcela <= maxParcelas; parcela++) {
            double valorParcela = valorCarro / parcela;
            System.out.println("Parcela " + parcela + " - R$ " + valorParcela);
        }

    }
}
