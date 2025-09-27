package Exercicios.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Mercado {
    public static void main(String[] args) {
        Map<String, String> produtos = new HashMap<>();

        produtos.put("SKU-001", "Café em Pó 500g");
        produtos.put("SKU-002", "Caixa de Leite 1L");
        produtos.put("SKU-003", "Pão de forma");

        System.out.println("\n");
        System.out.println(produtos.get("SKU-001"));

        if (produtos.containsKey("SKU-004")) {
            System.out.println(produtos.get("SKU-004"));
        } else {
            System.out.println("Não encontrado");
        }

        produtos.remove("SKU-001");

        for (String p : produtos.keySet()){
            String nomeProduto = produtos.get(p);
            System.out.println("Código: " + p + ", Produto: " + nomeProduto);
        }
    }
}
