package Exercicios.OrientacaoObjetos.FColecoes.tests;

import java.util.ArrayList;
import java.util.List;

import Exercicios.OrientacaoObjetos.FColecoes.domain.Tarefa;

public class ListaDeTarefas {
    public static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();

        tarefas.add(new Tarefa("Fazer café"));
        tarefas.add(new Tarefa("Estudar Java"));
        tarefas.add(new Tarefa("Colocar comida pros gatos"));

        System.out.println("\n");
        for (Tarefa t : tarefas) {
            System.out.println(t.getDescricao());
        }

        System.out.println("\nRemovendo uma tarefa");
        tarefas.remove(0);

        System.out.println("-------------------");
        for (Tarefa t : tarefas) {
            System.out.println(t.getDescricao());

        }

    }
}
