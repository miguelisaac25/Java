package Exercicios.Array;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int soma = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° " + "número");
            num[i] = sc.nextInt();
        }

        for (int n : num) {
            soma += n;
        }
        sc.close();

        System.out.println("A soma total é: " + soma);
    }
}
