package Exercicios.AAHeranca.Funcionaros.domain;

public class Gerente extends Funcionario {
    private int senha;
    private int numSubordinados;

    public Gerente(String nome, String cpf, double salario, int senha, int numSubordinados){
        super(nome, cpf, salario);
        this.senha = senha;
        this.numSubordinados = numSubordinados;
    }

    @Override
    public double calcularBonus(){
        return this.salario * 0.15 + 1000;
    }
}
