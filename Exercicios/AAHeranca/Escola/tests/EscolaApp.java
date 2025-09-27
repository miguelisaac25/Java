package Exercicios.AAHeranca.Escola.tests;

import Exercicios.AAHeranca.Escola.domain.Aluno;
import Exercicios.AAHeranca.Escola.domain.Escola;
import Exercicios.AAHeranca.Escola.domain.Professor;

public class EscolaApp {
    public static void main(String[] args) {
        Escola es = new Escola("Dom Bosco");
        Aluno a1 = new Aluno("Miguel", 22, "12312");
        Aluno a2 = new Aluno("Gabriel", 16, "32423");
        Professor prof1 = new Professor("Wagner", 35, "Banco de Dados");
        Professor prof2 = new Professor("Elvis", 33, "Analise de Sistemas");

        es.adicionarPessoa(a1);
        es.adicionarPessoa(a2);
        es.adicionarPessoa(prof1);
        es.adicionarPessoa(prof2);

        System.out.println("\n");
        es.listarPessoas();
    }

}
