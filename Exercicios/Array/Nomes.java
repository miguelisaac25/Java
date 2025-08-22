package Exercicios.Array;

public class Nomes {
    public static void main(String[] args) {
        String[] nomes = { "Abner", "Alexandre", "Henrique", "Alonso" };

        for (String nome : nomes) {
            if (nome.startsWith("A")) {
                System.out.println(nome);
            }
        }
    }
}
