package Exercicios.OrientacaoObjetos.FColecoes.tests;

import java.util.LinkedHashSet;

public class Comportado {
    public static void main(String[] args) {
        LinkedHashSet<String> lista = new LinkedHashSet<>();
        lista.add("Olá");
        lista.add("Tudo");
        lista.add("Certo");
        lista.add("Você");

        for(String imprime : lista){
            System.out.println(imprime);
        }
    }
}
