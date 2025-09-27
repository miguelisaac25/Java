package Exercicios.AAHeranca.Escola.domain;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nomeEscola;
    private List<Pessoa> listaPessoas;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        this.listaPessoas.add(pessoa);
    }

    public void listarPessoas() {
        System.out.printf("[%s]\n", nomeEscola);

        for (Pessoa p : listaPessoas) {
            if (listaPessoas.isEmpty()) {
                System.out.println("Não há pessoas cadastradas ainda.");
            } else {
                System.out.println(p.exibirDetalhes());

            }
        }
    }
}
