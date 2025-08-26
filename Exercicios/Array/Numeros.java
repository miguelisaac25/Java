package Exercicios.Array;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        String msg = "Digite um número:";

        for (int i = 0; i < num.length; i++) {
            System.out.println(msg);
            num[i] = sc.nextInt();
        }
        System.out.println("--------------------");
        for (int nums : num){
            System.out.println(nums);
        }

        sc.close();
    }
}
