package Exercicios.For;

public class Imprimir {
    public static void main(String[] args) {
        int max = 50;

        for (int i = 0; i < max; i++) {
            if (i > 25) {
                break;
            }

            System.out.println(i);
        }

    }
}