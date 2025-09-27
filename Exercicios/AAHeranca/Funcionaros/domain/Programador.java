package Exercicios.AAHeranca.Funcionaros.domain;

public class Programador extends Funcionario {
    private String lingPrincipal;

    public Programador(String nome, String cpf, double salario, String lingPrincipal){
        super(nome, cpf, salario);
        this.lingPrincipal = lingPrincipal;
    }

    @Override
    public double calcularBonus(){
        return 800.0;
    }

    public String getLingPrincipal(){
        return lingPrincipal;
    }
}
