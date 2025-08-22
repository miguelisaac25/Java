package Aulas;

public class Operadores {
    public static void main(String[] args) {
        // Operadores em Java
        // Aritméticos, relacionais, lógicos, de atribuição, unários

        int a = 10;
        int b = 5;

        // Aritméticos
        System.out.println("Aritméticos:");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // Relacionais
        System.out.println("\nRelacionais:");
        System.out.println("Igualdade: " + (a == b));
        System.out.println("Diferença: " + (a != b));
        System.out.println("Maior que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Maior ou igual a: " + (a >= b));
        System.out.println("Menor ou igual a: " + (a <= b));

        // Lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("\nLógicos:");
        System.out.println("E lógico: " + (x && y));
        System.out.println("Ou lógico: " + (x || y));
        System.out.println("Não lógico: " + (!x));

        // Atribuição
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("\nAtribuição:");
        System.out.println("c após atribuição: " + c);

        // Unários
        int d = 1;
        d++; // Incremento
        d--; // Decremento
        System.out.println("\nUnários:");
        System.out.println("d após incremento e decremento: " + d);


        // Exemplo de uso de operadores 
        int idade = 17;
        float salario = 3500f;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;

        System.out.println(isDentroDaLei ? "Dentro da lei" : "Fora da lei");


        // : Sendo o primeiro operando o valor a ser retornado se a condição for verdadeira, e o segundo operando o valor a ser retornado se a condição for falsa.
    }
}
