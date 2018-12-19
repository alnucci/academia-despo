package br.gov.serpro.academia.trabalhofinal.banco;


public class ContaCorrente {

	 Integer agencia;
	 Long conta;
	 Double saldo;

	public ContaCorrente(Integer agencia, Long conta, Double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}

	public Integer getAgencia() {
    
		return agencia;
    }

	  public Long getConta() {
		  return conta;
	  }

	public Double getSaldo() {
		return saldo;
		   
	}


}
