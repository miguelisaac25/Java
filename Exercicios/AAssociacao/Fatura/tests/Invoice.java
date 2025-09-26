package Exercicios.AAssociacao.Fatura.tests;

import Exercicios.AAssociacao.Fatura.domain.Fatura;
import Exercicios.AAssociacao.Fatura.domain.ItemVenda;

public class Invoice {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("Miguel");

        ItemVenda is1 = new ItemVenda("Apple", 2, 3.5);
        ItemVenda is2 = new ItemVenda("Ham", 1, 5);
        ItemVenda is3 = new ItemVenda("Cheese", 3, 2.2);

        fatura.addItem(is1);
        fatura.addItem(is2);
        fatura.addItem(is3);

        System.out.println("\n");
        fatura.invoiceShow();
    }
}
