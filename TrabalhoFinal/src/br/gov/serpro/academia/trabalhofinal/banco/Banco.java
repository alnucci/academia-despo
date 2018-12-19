package br.gov.serpro.academia.trabalhofinal.banco;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.academia.trabalhofinal.excecoes.ContaInexistenteException;
import br.gov.serpro.academia.trabalhofinal.excecoes.SaldoInsuficienteException;

public interface Banco {

	public String getNome();

	public List<Transacao> consultarExtrato(ContaCorrente contaCorrente) throws ContaInexistenteException;

	public BigDecimal consultarSaldo(ContaCorrente contaCorrente) throws ContaInexistenteException;

	public void creditarConta(ContaCorrente contaCorrenteCreditada, BigDecimal valor) throws ContaInexistenteException;

	public void debitarConta(ContaCorrente contaCorrenteDebitada, BigDecimal valor) throws ContaInexistenteException,
			SaldoInsuficienteException;

	public void transferenciaEntreContas(ContaCorrente contaCorrenteDebitada,
										 ContaCorrente contaCorrenteCreditada,
										 BigDecimal valor) throws ContaInexistenteException;




}
