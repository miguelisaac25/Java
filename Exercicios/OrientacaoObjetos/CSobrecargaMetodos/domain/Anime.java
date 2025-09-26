package Exercicios.OrientacaoObjetos.CSobrecargaMetodos.domain;

public class Anime {
    private String nome;

    private String tipo;
    private int episodios;

    public Anime(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public String textBlock() {
        return """
                %n
                Nome: %s
                Tipo: %s
                Episódios: %d
                    """.formatted(nome, tipo, episodios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

}
