package Exercicios.OrientacaoObjetos.BMetodos.Domain;

public class ClienteBancoImprime {
    @Override
    public String toString(){
        return"""
            Por favor, escolha uma opção:
            1. Depositar
            2. Sacar
            3. Exibir Saldo
            0. Sair
                """;
    }
}
