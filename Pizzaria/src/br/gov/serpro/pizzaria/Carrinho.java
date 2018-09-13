package br.gov.serpro.pizzaria;

public class Carrinho {
    // Calcula o valor total da compra com as pizzas e a entrega
    double precoTotal;
    String cliente;
    Pizza pizza;
    Entrega entrega;

    public double calculaPrecoTotal(String sabor, double distancia, String diaSemana) {

        Pizza pizza = new Pizza(sabor);
        Entrega entrega = new Entrega();


        precoTotal = pizza.calculaPreco() + entrega.calculaValorEntrega(distancia, diaSemana);

        return precoTotal;
    }
}
