package br.gov.serpro.conta;

/**
 * Created by 11315867869 on 06/11/18.
 */
public class ContaCorrenteRegular implements ContaCorrente {

    private double saldo;
    private double taxa_juros = 5.0;

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public double obterSaldo() {
        return saldo;
    }

    public double calcularTaxaJuros() {
        return taxa_juros;
    }
}
