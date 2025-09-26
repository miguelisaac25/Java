package Exercicios.AAssociacao.Funcionarios.domain;

import java.util.List;
import java.util.ArrayList;

public class Departamento {
    private String nomeDoDepartamento;
    private List<Funcionario> funcionarios;

    public Departamento(String nomeDoDepartamento) {
        this.nomeDoDepartamento = nomeDoDepartamento;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {

        this.funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        System.out.println("Departamento: " + this.nomeDoDepartamento);

        for (Funcionario f : funcionarios){
            System.out.println(f.toString());
        }

    }

    public String getNomeDepartamento() {
        return nomeDoDepartamento;
    }
}
