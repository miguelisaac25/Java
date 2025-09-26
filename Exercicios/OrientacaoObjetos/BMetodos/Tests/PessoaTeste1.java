package Exercicios.OrientacaoObjetos.BMetodos.Tests;

import java.util.Scanner;

import Exercicios.OrientacaoObjetos.BMetodos.Domain.Pessoa;

public class PessoaTeste1 {
    public static void main(String[] args) {
        Pessoa ps = new Pessoa();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        ps.setNome(teclado.nextLine());

        System.out.println("Qual sua idade?");
        ps.setIdade(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Qual sua altura?");
        ps.setAltura(teclado.nextDouble());
        teclado.nextLine();
        teclado.close();

        System.out.println(ps.saudar());
        if (ps.maioridade()) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        System.out.println(ps.toString());
    }




    
}
