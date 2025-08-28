package Exercicios.OrientacaoObjetos.AClasses.Domain;

public class Carro {
    public String nome;
    public String modelo;
    public String ano;

    public String toString(){
    String retorno = "";

    retorno = "Nome: " + nome;
    retorno += "\nModelo: " + modelo;
    retorno += "\nAno: " + ano;

    return retorno;

}
}
