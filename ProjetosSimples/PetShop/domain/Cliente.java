package ProjetosSimples.PetShop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Animal> pets;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.pets = new ArrayList<>();
    }

    public void adicionarPet(Animal pet){
        this.pets.add(pet);
    }

    public void exibirPets(){
        System.out.println("Dono: " + this.nome);
        if (this.pets.isEmpty()) {
            System.out.println("Não há animais desse cliente.");
        } else {
            for (Animal p : pets){
                System.out.println("Nome: " + p.getNome());
                System.out.println(p.fazerBarulho());
            }
        }
    }

    public String getCPF(){
        return cpf;
    }
    
}
