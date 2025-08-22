package Aulas;

public class While {
    // while, do while e for são estruturas de repetição que permitem executar um bloco de código várias vezes.

    public static void main(String[] args) {
        int contador = 0;

        // Exemplo de uso do while
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Resetando o contador para o exemplo do do-while
        contador = 0;

        // Exemplo de uso do do-while
        do {
            System.out.println("Contador do-while: " + contador);
            contador++;
        } while (contador < 5);

        // Exemplo de uso do for
        for (int i = 0; i < 5; i++) {
            System.out.println("Contador for: " + i);
        }
    }
}
