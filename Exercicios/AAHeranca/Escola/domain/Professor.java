package Exercicios.AAHeranca.Escola.domain;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public String exibirDetalhes(){
        return """
            Nome: [%s]
            Idade: [%d]
            Disciplina: [%s]
                """.formatted(nome, idade, disciplina);
    }
}
