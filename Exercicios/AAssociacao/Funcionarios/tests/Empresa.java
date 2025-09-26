package Exercicios.AAssociacao.Funcionarios.tests;

import Exercicios.AAssociacao.Funcionarios.domain.Departamento;
import Exercicios.AAssociacao.Funcionarios.domain.Funcionario;

public class Empresa {
    public static void main(String[] args) {
        Departamento dp = new Departamento("Oracle");
        Funcionario fun = new Funcionario("Miguel", "Engenheiro de Software", 101);
        Funcionario fun2 = new Funcionario("Carlos", "Front-End", 44);
        Funcionario fun3 = new Funcionario("Pedro", "SEO", 645);

        dp.adicionarFuncionario(fun);
        dp.adicionarFuncionario(fun2);
        dp.adicionarFuncionario(fun3);

        System.out.println("\n");
        dp.listarFuncionarios();

    }
}
