package Exercicios.OrientacaoObjetos.BMetodos.Tests;

import Exercicios.OrientacaoObjetos.BMetodos.Domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste01");
    }
}
