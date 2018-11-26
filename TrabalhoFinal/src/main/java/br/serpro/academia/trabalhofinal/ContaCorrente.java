package br.serpro.academia.trabalhofinal;

public interface ContaCorrente {

	void efetuarRetirada(double d);

	Object obterSaldo();

	void depositar(double d);

}
