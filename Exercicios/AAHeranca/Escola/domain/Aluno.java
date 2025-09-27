package Exercicios.AAHeranca.Escola.domain;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String exibirDetalhes(){
        return """
            Nome: [%s]
            Idade: [%d]
            Matrícula: [%s]
                """.formatted(nome, idade, matricula);
    }
}
