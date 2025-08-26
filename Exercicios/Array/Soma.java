package Exercicios.Array;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = "Digite um número para soma";
        int[] num = new int[5];
        int soma = 0;

        for (int i = 0; i < num.length; i++){
            System.out.println(msg);
            num[i] = sc.nextInt();
            soma += num[i]; 
        }

        sc.close();
        System.out.println("-----------------------");
        System.out.println("O valor total da soma é:\n" + soma);




    }
}
