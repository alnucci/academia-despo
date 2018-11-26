package br.serpro.academia.trabalhofinal;

public interface ContaCorrente {

	void efetuarRetirada(double d);

    public double obterSaldo();

	void depositar(double d);

}
