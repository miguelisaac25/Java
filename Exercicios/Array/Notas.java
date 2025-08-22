package Exercicios.Array;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        int aluno = 1;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digita a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }

        for (int nota : notas) {
            System.out.println("Nota aluno " + aluno + ": " + nota);
            aluno++;
        }
        sc.close();

    }
}
