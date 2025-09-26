package Exercicios.OrientacaoObjetos.EAssociacao.tests;

import Exercicios.OrientacaoObjetos.EAssociacao.domain.Biblioteca.Autor;
import Exercicios.OrientacaoObjetos.EAssociacao.domain.Biblioteca.Livro;

public class Biblioteca {
    public static void main(String[] args) {
        Livro viagemcTerra = new Livro("Viagem ao Centro da Terra", 2004);

        Livro oitentaDias = new Livro("A Volta ao Mundo em 80 dias", 2000);

        Livro motanhaMagica = new Livro("Viagem ao Centro da Terra", 2004);

        Livro[] livro = {viagemcTerra, oitentaDias, motanhaMagica};

        Autor autor = new Autor("Julio Verne", "Alemã");

        autor.setLivros(livro);

        autor.exibirBibliografia();

    }
}
