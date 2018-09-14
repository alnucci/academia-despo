package br.gov.serpro.pizzaria;

public class Pizza {
 // Calcula o preço baseado nos ingredientes da pizza

/* Pizza padrão 1
    Mussarela, calabreza, margherita, napolitana

   Pizza padrão 2
    Frango catupiry, toscana
  */

    String sabor;
    double preco;

    public Pizza(String sabor) {

        this.sabor = sabor;
    }

    public double calculaPreco(){

        if(sabor.equals("Calabreza")) {
            preco = 27.0;
        }else if (sabor.equals("Mussarela")) {
            preco = 25.0;
        }else if (sabor.equals("Frango catupiry"))
            preco = 32.0;
        return preco;
    }
}
