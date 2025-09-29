package ProjetosSimples.PetShop.domain;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public String fazerBarulho(){
        return "Som de animal";
    }

    
}
