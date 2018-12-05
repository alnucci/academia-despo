package br.serpro.academia.trabalhofinal;


public class ContaCorrente {

	private Integer agencia;
	private Long conta;
	private double saldo;


	public ContaCorrente(Integer agencia, Long conta, Double saldo){
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
