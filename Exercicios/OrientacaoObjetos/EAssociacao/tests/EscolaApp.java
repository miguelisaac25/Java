package Exercicios.OrientacaoObjetos.EAssociacao.tests;

import Exercicios.OrientacaoObjetos.EAssociacao.domain.Escola.Disciplina;
import Exercicios.OrientacaoObjetos.EAssociacao.domain.Escola.Professor;

public class EscolaApp {
    public static void main(String[] args) {
        Professor profJonas = new Professor("Jonas Figueira");

        Disciplina poo = new Disciplina("Programação Orientada a Objetos", "POO123");
        
        Disciplina bd = new Disciplina("Banco de Dados", "BD456");

        Disciplina web = new Disciplina("Desenvolvimento Web", "WEB789");

        Disciplina[] disciplinasDoJonas = new Disciplina[3];

        disciplinasDoJonas[0] = poo;
        disciplinasDoJonas[1] = bd;
        disciplinasDoJonas[2] = web;

        profJonas.setDisciplinas(disciplinasDoJonas);

        profJonas.exibirDisciplinas();
    }
}
