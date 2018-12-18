package br.serpro.academia.trabalhofinal.banco;

import br.serpro.academia.trabalhofinal.excecoes.ContaInexistenteException;
import br.serpro.academia.trabalhofinal.excecoes.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.List;

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
