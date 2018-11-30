package br.serpro.academia.trabalhofinal;

public interface ContaCorrente {

	void realizarSaque(double valor) throws SaldoInsuficienteException;

    public double consultarSaldo();

	void depositar(double valor);
	
}
