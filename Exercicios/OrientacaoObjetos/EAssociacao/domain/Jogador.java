package Exercicios.OrientacaoObjetos.EAssociacao.domain;

public class Jogador {
    private String nome;
    private int camisa;

    public Jogador(String nome, int camisa) {
        this.nome = nome;
        this.camisa = camisa;
    }

    public String exibirDetalhes() {
        return """
                Jogador: %s
                Camisa: %s
                """.formatted(nome, camisa);
    }

    public String getNome() {
        return nome;
    }

    public int getCamisa() {
        return camisa;
    }

}
