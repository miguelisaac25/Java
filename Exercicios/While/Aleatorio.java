package Exercicios.While;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        int palpite = 0;

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int numrandom = rand.nextInt(100) + 1;

        while (palpite != numrandom) {
            System.out.println("Palpite de número aleatório");

            palpite = sc.nextInt();

            if (palpite > numrandom) {
                System.out.println("Muito alto");
            } else if (palpite < numrandom) {
                System.out.println("Muito baixo");
            } else if (palpite == numrandom) {
                System.out.println("Parabéns, você acertou");
            } else {
                System.out.println("Número inválido");
            }
        }
        sc.close();

    }
}
