package Exercicios.AAssociacao.Funcionarios.domain;

public class Funcionario {
    private String nome;
    private String cargo;
    private int idFuncional;

    public Funcionario(String nome, String cargo, int idFuncional) {
        this.nome = nome;
        this.cargo = cargo;
        this.idFuncional = idFuncional;
    }

    @Override
    public String toString(){
        return """
            ID: %d
            Nome: %s
            Cargo: %s
            \n
                """.formatted(idFuncional, nome, cargo);
    }

}