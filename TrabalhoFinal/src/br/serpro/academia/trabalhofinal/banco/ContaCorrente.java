package br.serpro.academia.trabalhofinal.banco;


import java.util.Date;

public interface ContaCorrente {

	private Integer agencia;
	private Long conta;
	private Double saldo;


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
