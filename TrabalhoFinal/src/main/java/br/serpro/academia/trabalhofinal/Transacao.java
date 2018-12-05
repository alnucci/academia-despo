package br.serpro.academia.trabalhofinal;

public interface Transacao {

	void realizarSaque(double valor) throws SaldoInsuficienteException;

    public double consultarSaldo();

	void depositar(double valor);
	
	//Transferencia 
	
}
