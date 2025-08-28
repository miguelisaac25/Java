package Exercicios.OrientacaoObjetos.BMetodos.Tests;

import Exercicios.OrientacaoObjetos.BMetodos.Domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 4);
        System.out.println(result);

    }
}
