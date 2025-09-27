package Exercicios.AAHeranca.Enquete.tests;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EnqueteApp {
    public static void main(String[] args) {
        List<String> votos = new ArrayList<>();
        votos.add("Java");
        votos.add("Python");
        votos.add("Java");
        votos.add("JavaScript");
        votos.add("Python");
        votos.add("Java");
        votos.add("C#");
        votos.add("C#");
        votos.add("Java");

        HashMap<String, Integer> contagem = new HashMap<>();

        for (String v : votos){
            contagem.put(v, contagem.getOrDefault(v, 0) + 1);
        }

        for (String chave : contagem.keySet()){
            System.out.println("\n");
            System.out.println(chave + " teve " + contagem.get(chave) + " votos");
        }
    }
}