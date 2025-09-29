package ProjetosSimples.PetShop.domain;

import java.util.HashMap;
import java.util.Map;

public class PetShop {
    Map<String, Cliente> clientes = new HashMap<>();

    public PetShop() {
        this.clientes = new HashMap<>();
    }

    public void cadastrarDono(Cliente dono) {
        clientes.put(dono.getCPF(), dono);
    }

    public void buscasDonoPorCPF(String cpf) {
        if(clientes.containsKey(cpf)){
            Cliente cl = clientes.get(cpf);
            System.out.println("\n");
            cl.exibirPets();
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
