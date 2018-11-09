package br.gov.serpro.conta;

/**
 * Created by 11315867869 on 06/11/18.
 */
public interface ContaCorrente {
   public void depositar(double valor);

    public double obterSaldo();

    public double calcularTaxaJuros();

    public void efetuarRetirada(double valor);
}
