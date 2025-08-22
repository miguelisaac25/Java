package Aulas;

public class OperadorTernario {
    public static void main(String[] args) {
        // Exemplo de uso do operador ternário
        int idade = 17;
        float salario = 3500f;

        // Verifica se a pessoa está dentro da lei
        boolean isDentroDaLei = idade > 30 && salario >= 4612;

        // Usa o operador ternário para imprimir a mensagem apropriada

        // String resultado = condição ? valorSeVerdadeiro : valorSeFalso;
        System.out.println(isDentroDaLei ? "Dentro da lei" : "Fora da lei");


        // Operador ternário é muito útil para simplificar expressões condicionais, tente usar ele sempre que possível.
    }
}
