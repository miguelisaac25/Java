package Exercicios.OrientacaoObjetos.BMetodos.Tests;
import java.util.Scanner;

import Exercicios.OrientacaoObjetos.AClasses.Domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();


        System.out.println("Por favor, digite o nome:\n");
        estudante.nome = sc.nextLine();

        System.out.println("Por favor digite a idade:\n");
        estudante.idade = sc.nextInt();

        System.out.println("Por favor digite o sexo (M) para masculino e (F) para feminino");
        estudante.sexo = sc.next().charAt(0);

        System.out.println(estudante.toString());

        sc.close();

    }
}
