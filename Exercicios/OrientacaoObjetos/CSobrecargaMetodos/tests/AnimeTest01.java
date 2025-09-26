package Exercicios.OrientacaoObjetos.CSobrecargaMetodos.tests;

import Exercicios.OrientacaoObjetos.CSobrecargaMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akuma no Drive","TV", 12);
        System.out.println(anime.textBlock());
    }
}
