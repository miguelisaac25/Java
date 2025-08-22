package Exercicios.For;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número para tabuada: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
        sc.close();
    }
}
