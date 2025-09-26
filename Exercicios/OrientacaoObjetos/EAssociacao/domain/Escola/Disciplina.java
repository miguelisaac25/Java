package Exercicios.OrientacaoObjetos.EAssociacao.domain.Escola;

public class Disciplina {
    private String nome;
    private String codigo;
    
    public Disciplina(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String exibir(){
        return String.format("Disciplina: %s (Cod: %s)", this.nome, this.codigo);
    }

}

