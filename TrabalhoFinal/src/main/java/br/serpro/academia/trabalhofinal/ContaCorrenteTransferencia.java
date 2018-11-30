package br.serpro.academia.trabalhofinal;

import static org.junit.Assert.fail;

public class ContaCorrenteTransferencia implements Banco {
	
	 public void validarConta(int conta) throws ContaInexistenteException {

	        if (conta "existe") {
	        	 ContaCorrente contaOrigem = new ContaCorrenteComum();

	        }else {
	            throw new ContaInexistenteException("Conta Inexistente");}

	        }

	public void realizarTransferencia(int contaOrigem, int contaDestino, double valor) {
		// TODO realizar saque contaOrigem
		 try {
			 // TODO validar conta origem
	            contaCorrente.realizarSaque(valor);
	            
	        } catch (SaldoInsuficienteException exception) {
	            fail("Saldo Insuficiente");
	        }
		// TODO realizar deposito contaDestino
		 // TODO validar conta destino
	        contaCorrente.depositar(valor);

	}

}
