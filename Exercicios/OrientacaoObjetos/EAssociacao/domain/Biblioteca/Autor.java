package Exercicios.OrientacaoObjetos.EAssociacao.domain.Biblioteca;

public class Autor {
    private String nome;
    private String nacionalidade;
    private Livro[] livros;


    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public void setLivros(Livro[] livros){
        this.livros = livros;
    }

    public void exibirBibliografia(){
        System.out.println("\nAutor: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade + "\n");

        if(this.livros != null){
            for (int i = 0; i < this.livros.length; i++){
                Livro livroAutor = this.livros[i];

                System.out.println("- " + livroAutor.getTitulo() + " Ano: " + livroAutor.getAnoPubli());
            }
        } else {
            System.out.println("Nenhum livro cadastrado");
        }

    }
    
}
