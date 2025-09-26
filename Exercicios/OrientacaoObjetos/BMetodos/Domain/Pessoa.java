package Exercicios.OrientacaoObjetos.BMetodos.Domain;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa() {

    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String saudar() {
        return "Olá, bem vindo";
    }

    public Boolean maioridade() {
        if (idade > 18) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return """
                nome: %s
                idade: %d
                altura: %.2f
                    """.formatted(nome, idade, altura);
    }
}