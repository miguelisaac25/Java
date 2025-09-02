package Exercicios.OrientacaoObjetos.BMetodos.Tests;

import java.util.Scanner;

import Exercicios.OrientacaoObjetos.BMetodos.Domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Por favor, digite o nome:\n");
        estudante.setNome(sc.nextLine());

        System.out.println("Por favor digite a idade:\n");
        estudante.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("Por favor digite o sexo (M) para masculino e (F) para feminino");
        estudante.setSexo(sc.nextLine());

        System.out.println(estudante);

        sc.close();

    }
}
