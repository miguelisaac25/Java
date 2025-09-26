package Exercicios.OrientacaoObjetos.EAssociacao.domain;

public class Time {
    private String nome;
    private String cidade;
    private Jogador[] jogadores;


    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void setJogadores(Jogador[] jogadores){
        this.jogadores = jogadores;
    }

    public void imprimirTime(){
        System.out.println("Time: " + this.nome);
        System.out.println("Cidade: " + this.cidade);

        if (jogadores != null){
            for (int i = 0; i < this.jogadores.length; i++){
                Jogador timeJogadores = this.jogadores[i];

                System.out.println(timeJogadores.exibirDetalhes());
            }
        } else {
            System.out.println("O time ainda não tem jogadores");
        }
    }

    


}
