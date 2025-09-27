package Exercicios.AAHeranca.Funcionaros.domain;

public class Designer extends Funcionario{
    private String ferramentaPref;

    public Designer(String nome, String cpf, double salario, String ferramentaPref){
        super(nome, cpf, salario);
        this.ferramentaPref = ferramentaPref;
    }

    public String getFerramentaPreferida(){
        return ferramentaPref;
    }

    @Override
    public double calcularBonus(){
        return this.salario * 0.12;

    }
}
