package Exercicios.OrientacaoObjetos.FColecoes.tests;

import java.util.ArrayList;
import java.util.List;

public class Cores {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();
        System.out.println("\n");
        cores.add("Azul");
        cores.add("Preto");
        cores.add("Branco");

        System.out.println(cores);

        System.out.println("A minha cor favorita é " + cores.get(1));

        cores.remove(0);

        System.out.println(cores);
        System.out.println(cores.size());

    }
}
