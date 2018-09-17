package br.gov.serpro.cofrinho;

public class Principal {

    public static void main(String[] args) {


        br.gov.serpro.cofrinho.Moeda moedaCincoCents = new br.gov.serpro.cofrinho.Moeda(br.gov.serpro.cofrinho.ValorMoeda.CINCO_CENTAVOS);
        br.gov.serpro.cofrinho.Moeda moedaDezCents1 = new br.gov.serpro.cofrinho.Moeda(br.gov.serpro.cofrinho.ValorMoeda.DEZ_CENTAVOS);
        br.gov.serpro.cofrinho.Moeda moedaVinteCincoCents = new br.gov.serpro.cofrinho.Moeda(br.gov.serpro.cofrinho.ValorMoeda.VINTE_CINCO_CENTAVOS);
        br.gov.serpro.cofrinho.Moeda moedaCinquentaCents = new br.gov.serpro.cofrinho.Moeda(br.gov.serpro.cofrinho.ValorMoeda.CINQUENTA_CENTAVOS);
        br.gov.serpro.cofrinho.Moeda moedaUmReal = new br.gov.serpro.cofrinho.Moeda(br.gov.serpro.cofrinho.ValorMoeda.UM_REAL);


        br.gov.serpro.cofrinho.Cofrinho cofrinho = new br.gov.serpro.cofrinho.Cofrinho();

        cofrinho.adicionarMoeda(moedaCincoCents);
        cofrinho.adicionarMoeda(moedaDezCents1);
        cofrinho.adicionarMoeda(moedaDezCents1);
        cofrinho.adicionarMoeda(moedaDezCents1);
        cofrinho.adicionarMoeda(moedaVinteCincoCents);
        cofrinho.adicionarMoeda(moedaCinquentaCents);
        cofrinho.adicionarMoeda(moedaUmReal);

        System.out.println("O cofre tem um total de " + cofrinho.calcularQuantidadeTotalMoedas() + " moedas.");
        System.out.println("O cofre tem um total de " + cofrinho.calcularQuantidadeTotalMoedas_NaoOtimizado() + " moedas(Não otimizado).");
        System.out.println("O cofre tem um total de " + cofrinho.calcularValorTotalMoedas() + " real(is).");
        System.out.println("Qtde moedas de 10 centavos: " + cofrinho.obterQuantidadeMoedasPorMoeda(moedaDezCents1));
        System.out.println("Qtde moedas de 25 centavos: " + cofrinho.obterQuantidadeMoedasPorMoeda(moedaVinteCincoCents));
        System.out.println("Qtde moedas de 1 real: " + cofrinho.obterQuantidadeMoedasPorMoeda(moedaUmReal));
        System.out.println("O valor da moeda de maior valor é: " + cofrinho.obterValorDaMoedaDeMaiorValorDentroCofrinho());


    }

}