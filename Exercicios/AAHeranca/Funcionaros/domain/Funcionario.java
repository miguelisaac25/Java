package Exercicios.AAHeranca.Funcionaros.domain;

public class Funcionario {
    private String nome;
    private String cpf;
    protected double salario; // protected para que as classes filhas possam acessar diretamente se precisar

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double calcularBonus() {
        return this.salario * 0.10;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}