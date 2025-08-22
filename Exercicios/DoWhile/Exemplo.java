package Exercicios.DoWhile;

public class Exemplo {
    public static void main(String[] args) {
        int i = 0;

        // Aqui o programa vai rodar ao menos uma vez e depois verificar a condição
        do {
            System.out.println("Valor de i: " + i);
            i++;
        } while (i < 5);

    }
}
