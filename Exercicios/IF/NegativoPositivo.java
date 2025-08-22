package Exercicios.IF;

import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args) {

        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");

        num = sc.nextInt();

        sc.close();

        if (num < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é positivo.");
        }

    }
}
