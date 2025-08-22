package Exercicios.DoWhile;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(" 1. Dizer Olá\n 2. Dizer Tchau\n 0. Sair.");

            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Olá");

            } else if (opcao == 2) {
                System.out.println("Tchau");
            } else if (opcao == 0) {
                System.out.println("Até mais");
            } else {
                System.out.println("Invalido.");
            }

        } while (opcao != 0);

        sc.close();
    }

}
