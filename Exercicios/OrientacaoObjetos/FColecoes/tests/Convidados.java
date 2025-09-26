package Exercicios.OrientacaoObjetos.FColecoes.tests;

import java.util.ArrayList;
import java.util.List;

public class Convidados {
    public static void main(String[] args) {
        List<String> listaConvidados = new ArrayList<>();

        System.out.println("\n");
        listaConvidados.add("Miguel");
        listaConvidados.add("João");
        listaConvidados.add("Nathan");
        listaConvidados.add("Kevin");

        for (String welcome : listaConvidados) {
            if (listaConvidados.isEmpty()) {
                System.out.println("A lista de convidados está vazia.");
            }
            System.out.println("Seja Bem-Vindo " + welcome);

        }

        System.out.println("O total de convidados da festa foi de : " + listaConvidados.size());
    }
}
