package Exercicios.OrientacaoObjetos.BMetodos.Tests;

import java.util.Scanner;

import Exercicios.OrientacaoObjetos.BMetodos.Domain.ClienteBanco;
import Exercicios.OrientacaoObjetos.BMetodos.Domain.ClienteBancoImprime;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClienteBancoImprime in = new ClienteBancoImprime();
        ClienteBanco cb = new ClienteBanco(11230, "Miguel", 3500.0);
        int opcao = 9;

        while (opcao != 0) {
            System.out.println(in.toString());
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Por favor, digite o valor que deseja depositar:\n");
                    if (cb.depositar(sc.nextDouble())) {
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Depósito não realizado! Valor inválido.");
                    }

                    break;
                case 2:
                    System.out.println("Por favor, digite o valor que deseja sacar:\n");
                    if (cb.sacar(sc.nextDouble())) {
                        System.out.println("Saque realizado com sucesso!");
                    } else  {
                        System.out.println("Saque não realizado! Valor acima do saldo.");
                    }
                    break;
                case 3:
                    System.out.println(cb.toString());
                    break;
                case 0:
                    System.out.println("Obrigado e volte sempre");
                    opcao = 0;
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        }

        sc.close();
    }

}
