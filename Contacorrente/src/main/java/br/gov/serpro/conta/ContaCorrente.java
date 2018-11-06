package br.gov.serpro.conta;

/**
 * Created by 11315867869 on 06/11/18.
 */
public interface ContaCorrente {
    void depositar(double v);

    double obterSaldo();

    double calcularTaxaJuros();
}
