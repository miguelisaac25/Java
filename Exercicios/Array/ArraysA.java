package Exercicios.Array;

public class ArraysA {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        nomes[0] = "Javier";
        nomes[1] = "Pedro";
        nomes[2] = "Henrique";
        nomes[3] = "João";
        nomes[4] = "Arthur";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
