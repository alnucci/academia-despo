package br.gov.serpro.conta;

/**
 * Created by 11315867869 on 06/11/18.
 */
public class ContaCorrenteRegular implements ContaCorrente {

    private double saldo;
    private double taxaJuros = 5.0;

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public double obterSaldo() {
        return saldo;
    }

    public double calcularTaxaJuros() {
        return taxaJuros;
    }

    public void efetuarRetirada(double valor) {

        if (valor <= this.saldo) {

            this.saldo = this.saldo - valor;
        }else {
            throw new SaldoInsuficienteException("Saldo insuficiente");

        }
    }
}
