package Exercicios.OrientacaoObjetos.FColecoes.domain.Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private int idade;
    private List<Livro> livros;

    public Autor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public void exibirBiblio(){
        System.out.println("Autor: " + nome + "\nIdade: " + idade);
        if (this.livros != null){
            for (Livro livrosImp : livros){
                Livro livroCadastrado = livrosImp;
                System.out.println("- " + livroCadastrado);
            }
        }
    }

}
