package Aulas;

/* Prática
    -Crise variáveis para os campos descritos abaixo entre <> e imprima:

    Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario> na data <data>
 */

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Miguel";
        String endereco = "Rua 15, 244";
        double salario = 2500.50;
        String data = "14/08/2025";

        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de "
                + salario + " na data " + data;

        System.out.println(relatorio);
    }

}
