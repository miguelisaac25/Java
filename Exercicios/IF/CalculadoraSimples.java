package Exercicios.IF;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        /* Calculadora simples + - * / */

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        int operacao = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.println("Escolha a operação: \n 1. Soma\n 2. Subtração\n 3. Multiplicação \n 4. Divisão");
        operacao = sc.nextInt();

        if (operacao < 1 || operacao > 4) {
            System.out.println("Operação inválida, tente novamente.");
        } else if (operacao == 1) {
            resultado = num1 + num2;
            System.out.println("O resultado da sua operação é: " + resultado);
        } else if (operacao == 2 && num1 > num2) {
            resultado = num1 - num2;
            System.out.println("O resultado da sua operação é: " + resultado);
        } else if (operacao == 3) {
            resultado = num1 * num2;
            System.out.println("O resultado da sua operação é: " + resultado);
        } else if (operacao == 4 && num2 != 0) {
            resultado = num1 / num2;
            System.out.println("O resultado da sua operação é: " + resultado);
        } else {
            System.out.println("Operação inválida, tente novamente.");
        }

        sc.close();
    }
}
