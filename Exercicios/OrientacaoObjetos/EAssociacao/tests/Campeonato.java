package Exercicios.OrientacaoObjetos.EAssociacao.tests;

import Exercicios.OrientacaoObjetos.EAssociacao.domain.Jogador;
import Exercicios.OrientacaoObjetos.EAssociacao.domain.Time;

public class Campeonato {
    public static void main(String[] args) {
       Jogador jogador = new Jogador("Neymar", 10);
       Jogador jogador2 = new Jogador("Cafu", 22);
       Jogador jogador3 = new Jogador("Ronaldo", 3);

       Jogador[] jogadores = {jogador, jogador2, jogador3};

       Time time = new Time("Barça", "Liverpool");

       time.setJogadores(jogadores);
       time.imprimirTime();
        

    }
}
