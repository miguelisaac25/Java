package Exercicios.OrientacaoObjetos.AClasses.Tests;

import Exercicios.OrientacaoObjetos.AClasses.Domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "X4";
        carro.modelo = "BMW";
        carro.ano = "2022";

        carro2.nome = "Mercedes";
        carro2.modelo = "C180";
        carro2.ano = "2020";

        System.out.println("Carro\n" + carro.toString());
        System.out.println("--------------------");
        System.out.println("Carro\n" + carro2.toString());

    }
}
