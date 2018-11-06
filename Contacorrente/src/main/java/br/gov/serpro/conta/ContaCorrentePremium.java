package br.gov.serpro.conta;

/**
 * Created by 11315867869 on 06/11/18.
 */
public class ContaCorrentePremium implements ContaCorrente {


    private double saldo;
    private double taxa_juros = 1.0;


    public void depositar(double valor) {
    this.saldo = saldo + (1.06 * valor);
    }


    public double obterSaldo() {
        return saldo;
    }


    public double calcularTaxaJuros() {
        return taxa_juros;
    }
}
