package Exercicios.AAssociacao.Fatura.domain;

public class ItemVenda {
    private String productName;
    private int quantity;
    private double unitPrice;


    public ItemVenda(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calcularSubtotal(){
        double total = quantity * unitPrice;
        return total;
    }

    @Override
    public String toString(){
        return """
            Product: %s
            Quantity: %d
            Unit Price: %.2f
            Subtotal: %.2f
                """.formatted(productName, quantity, unitPrice, calcularSubtotal());
    }


}
