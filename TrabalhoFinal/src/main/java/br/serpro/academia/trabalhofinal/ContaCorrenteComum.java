package br.serpro.academia.trabalhofinal;


public class ContaCorrenteComum implements ContaCorrente {
	
	
	double saldo;
	
	public double consultarSaldo() {
    
		return saldo;
    }

	  public void realizarSaque(double valor) throws SaldoInsuficienteException {

	        if (valor <= this.saldo) {

	            this.saldo = this.saldo - valor;
	        }else {
	            throw new SaldoInsuficienteException("Saldo insuficiente");}

	        }

	public void depositar(double valor) {
		this.saldo = saldo + valor;
		   
	}

	public void realizarTransferencia(int contaOrigem, int contaDestino, double valor) {
		// TODO realizar saque contaOrigem
		
		// TODO realizar deposito contaDestino
		
	}

}
