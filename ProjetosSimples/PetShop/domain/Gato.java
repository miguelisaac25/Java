package ProjetosSimples.PetShop.domain;

public class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    @Override
    public String fazerBarulho() {
        return "Miau";
    }
}
