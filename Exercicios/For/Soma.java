package Exercicios.For;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        sc.close();

        System.out.println("Soma total: " + soma);

    }
}
