package Exercicios.AAHeranca.Funcionaros.tests;

import Exercicios.AAHeranca.Funcionaros.domain.Designer;
import Exercicios.AAHeranca.Funcionaros.domain.Funcionario;
import Exercicios.AAHeranca.Funcionaros.domain.Gerente;
import Exercicios.AAHeranca.Funcionaros.domain.Programador;

public class EmpresaApp {
    public static void main(String[] args) {
        Funcionario funcComum = new Funcionario("Miguel", "111", 1500);

        Gerente gerenteAna = new Gerente("Ana Clara", "222", 2500, 123, 10);

        Programador progCarlos = new Programador("Carlos", "333", 3000, "Java");

        Designer designerJoao = new Designer("João", "555", 3000, "Photoshop");

        System.out.println("\n--- CALCULO DE BÔNUS ---");

        System.out.printf("Bonus do Funcionário %s: R$ %.2f\n", funcComum.getNome(), funcComum.calcularBonus());

        System.out.printf("Bônus do Gerente %s: R$ %.2f\n", gerenteAna.getNome(), gerenteAna.calcularBonus());

        System.out.printf("Bônus do Programador %s: R$ %.2f\n", progCarlos.getNome(), progCarlos.calcularBonus());

        System.out.printf("Bônus do Designer %s: R$ %.2f | Ferramenta: %s ", designerJoao.getNome(), designerJoao.calcularBonus(), designerJoao.getFerramentaPreferida());
    }

}
