package Exercicios.Array;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int maior = 1;
        int menor = 99999;

        // Olha eu não vou mentir que tive dificuldade nesse aqui, com os exercícios anteriores eu meio que fui acertando na tentativa e erro mas me perdi na hora do menor, pesquisei melhor sem ter a resposta do código e acertei apesar de não entender 100% a lógica desse treco aí, mas já estou usando for e foreach bem melhor e lidando melhor com arrays, o que antigamente era tenebroso

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];

            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Maior número:\n" + maior);
        System.out.println("Menor número:\n" + menor);
        sc.close();
    }
}
