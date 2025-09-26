package Exercicios.AAssociacao.Fatura.domain;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private String clientName;
    private List<ItemVenda> itens;

    public Fatura(String clientName) {
        this.clientName = clientName;
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemVenda item) {
        this.itens.add(item);
    }

    public double totalInvoice() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;

    }

    public void invoiceShow(){
        System.out.println("Client: " + this.clientName);
        System.out.println("---INVOICE ITENS---");
        for (ItemVenda i : itens){
            System.out.println(i.toString());
        }

        System.out.println("---TOTAL INVOICE---");
        double totalValue = totalInvoice();
        System.out.println("$: " + totalValue);
    }

    public String getClientName(){
        return clientName;
    }

}
