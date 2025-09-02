package Exercicios.OrientacaoObjetos.BMetodos.Domain;

public class Estudante {
    String nome;
    int idade;
    String sexo;

    public Estudante() {

    }

    public Estudante(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Idade: %d
                Sexo: %s

                """.formatted(nome, idade, sexo);
    }
}
