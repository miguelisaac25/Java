package Exercicios.OrientacaoObjetos.EAssociacao.domain.Escola;

public class Professor {
    private String nome;
    private Disciplina[] disciplinas;

    public Professor(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDisciplinas(Disciplina[] disciplinas){
        this.disciplinas = disciplinas;
    }

    public void exibirDisciplinas(){
        System.out.println("Professor: " + this.nome);
        System.out.println("Leciona:");

        if (this.disciplinas != null){
            for (int i = 0; i < this.disciplinas.length; i++){
                Disciplina disciplinaAtual = this.disciplinas[i];

                System.out.println("- " + disciplinaAtual.exibir() );
            } 
        } else {
                System.out.println("Nenhuma disciplina cadastrada ainda");
            }
    }
}
