package br.gov.serpro.conta;

/**
 * Created by 11315867869 on 06/11/18.
 */
public class ContaCorrentePremium implements ContaCorrente {


    private static double LIMITE_SALDO_PREMIUM = 50.00;

    private double saldo;
    private double taxaJuros = 1.0;


    public void depositar(double valor) {
    this.saldo = saldo + (1.06 * valor);
    }


    public double obterSaldo() {
        return saldo;
    }


    public double calcularTaxaJuros() {
        return taxaJuros;
    }


    public void efetuarRetirada(double valor) {

        if (valor <= this.saldo + LIMITE_SALDO_PREMIUM) {

            this.saldo = this.saldo - valor;
        }else {
            throw new SaldoInsuficienteException("Saldo insuficiente");

        }
    }
}
