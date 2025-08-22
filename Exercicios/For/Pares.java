package Exercicios.For;

public class Pares {
    // Imprimir todos os números pares de 1 a 20
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("O número " + i + " é par");
            }
        }
    }
}
