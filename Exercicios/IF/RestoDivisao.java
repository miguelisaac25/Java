package Exercicios.IF;

import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        int n = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para descobrir se é ímpar ou par: ");

        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        sc.close();

    }
}
