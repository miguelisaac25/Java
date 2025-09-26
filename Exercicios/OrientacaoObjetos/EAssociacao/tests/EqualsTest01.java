package Exercicios.OrientacaoObjetos.EAssociacao.tests;

import Exercicios.OrientacaoObjetos.EAssociacao.domain.Usuario;

public class EqualsTest01 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Miguel", "teste@gmail.com");
        Usuario u2 = new Usuario("Miguel", "teste@gmail.com");
        //Não dá certo pois ele referência em um valor de memória e não na memória
        System.out.println(u2.equals(u1));
    }
}
