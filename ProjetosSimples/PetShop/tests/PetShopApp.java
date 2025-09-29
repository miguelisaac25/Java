package ProjetosSimples.PetShop.tests;

import ProjetosSimples.PetShop.domain.Cachorro;
import ProjetosSimples.PetShop.domain.Cliente;
import ProjetosSimples.PetShop.domain.Gato;
import ProjetosSimples.PetShop.domain.PetShop;

public class PetShopApp {
    public static void main(String[] args) {
        Cachorro cr = new Cachorro("Bob", 5, "Husky Siberiano");
        Cachorro cr1 = new Cachorro("Manteiga", 10, "SRD");
        Cliente cl = new Cliente("Miguel", "111");
        Cliente cl1 = new Cliente("Luiza", "222");

        Gato gt = new Gato("Melody", 3, "Preto");
        Gato gt1 = new Gato("Banguela", 5, "Malhado");

        PetShop pts = new PetShop();


        pts.cadastrarDono(cl);
        pts.cadastrarDono(cl1);

        cl.adicionarPet(gt1);
        cl1.adicionarPet(gt);
        
        pts.buscasDonoPorCPF("111");
        pts.buscasDonoPorCPF("222");
        pts.buscasDonoPorCPF("333");
    }
}
