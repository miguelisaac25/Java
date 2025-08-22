package Exercicios.IF;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        int nota = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("Aprovado.");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação.");
        } else if (nota < 5) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("Nota inválida. Tente novamente.");
        }

        sc.close();
    }
}
