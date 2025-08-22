package Exercicios.Array;

public class ArraysA {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Javier";
        nomes[1] = "Pedro";
        nomes[2] = "Henrique";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
