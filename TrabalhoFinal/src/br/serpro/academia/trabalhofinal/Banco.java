package br.serpro.academia.trabalhofinal;

import java.math.BigDecimal;
import java.util.List;

public interface Banco {

	public List<Transacao> consultarExtrato(ContaCorrente contaCorrente) throws ContaInexistenteException;

	public BigDecimal consultarSaldo(ContaCorrente contaCorrente) throws ContaInexistenteException;

	public void creditarConta(ContaCorrente contaCorrenteCreditada, BigDecimal valor) throws ContaInexistenteException;

	public void debitarConta(ContaCorrente contaCorrenteDebitada, BigDecimal valor) throws ContaInexistenteException,
			SaldoInsuficienteException;

	public void transferenciaEntreContas(ContaCorrente contaCorrenteDebitada,
										 ContaCorrente contaCorrenteCreditada,
										 BigDecimal valor) throws ContaInexistenteException;




}
