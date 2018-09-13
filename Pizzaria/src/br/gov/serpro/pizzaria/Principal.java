package br.gov.serpro.pizzaria;

/**
 * Created by 11315867869 on 13/09/18.
 */
public class Principal {
    public static void main(String[] args) {


        Carrinho carrinhoPedidoA = new Carrinho();
        carrinhoPedidoA.cliente = "Monica";
        Carrinho carrinhoPedidoB = new Carrinho();
        carrinhoPedidoB.cliente = "Cebolinha";
        Carrinho carrinhoPedidoC = new Carrinho();
        carrinhoPedidoC.cliente = "Cascão";
        Carrinho carrinhoPedidoD = new Carrinho();
        carrinhoPedidoD.cliente = "Magali";


        System.out.println(carrinhoPedidoA.cliente + ", o total do seu pedido e\' " + carrinhoPedidoA.calculaPrecoTotal("Calabreza", 2, "diaUtil")+ "\n");
        System.out.println(carrinhoPedidoB.cliente + ", o total do seu pedido e\' " + carrinhoPedidoB.calculaPrecoTotal("Mussarela", 3, "diaUtil")+ "\n");
        System.out.println(carrinhoPedidoC.cliente + ", o total do seu pedido e\' " + carrinhoPedidoC.calculaPrecoTotal("Calabreza", 5, "naoDiaUtil")+ "\n");
        System.out.println(carrinhoPedidoD.cliente + ", o total do seu pedido e\' " + carrinhoPedidoD.calculaPrecoTotal("Frango catupiry", 6, "naoDiaUtil")+ "\n");



    }

}
