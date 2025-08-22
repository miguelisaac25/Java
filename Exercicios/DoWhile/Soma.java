package Exercicios.DoWhile;

import java.util.Scanner;

public class Soma {
    /*
     * Fazer um programa no qual o usuário vai digitando os números e somando,
     * quando digitar 0, o programa acaba
     */

    public static void main(String[] args) {
        int num = 0;
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Por favor digite um número para soma. (Digite 0 para encerrar o programa)");

            num = sc.nextInt();

            soma = soma + num;

            System.out.println("A soma total é " + soma);

        } while (num != 0);

        sc.close();
    }
}
