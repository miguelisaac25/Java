package Exercicios.OrientacaoObjetos.BMetodos.Domain;

public class ClienteBanco {
    private int numConta;
    private String titular;
    private double saldo;

    public ClienteBanco(int numConta, String titular, Double saldo){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } 
        return false;
    }

    @Override
    public String toString(){
        return"""
            Conta: %d
            Titular: %s
            Saldo atual: %.2f
                """.formatted(numConta, titular, saldo);
    }
}
