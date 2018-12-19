package br.gov.serpro.academia.trabalhofinal.caixa24h;

import br.gov.serpro.academia.trabalhofinal.banco.Banco;
import br.gov.serpro.academia.trabalhofinal.banco.ContaCorrente;
import br.gov.serpro.academia.trabalhofinal.banco.Transacao;
import br.gov.serpro.academia.trabalhofinal.excecoes.ContaInexistenteException;
import br.gov.serpro.academia.trabalhofinal.excecoes.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.List;

public class Caixa24h {
    
	Banco banco;

    public Caixa24h(Banco banco){
		this.banco = banco;
	}

	public String getNome(){

		return banco.getNome();

	}

	public BigDecimal consultarSaldo(ContaCorrente contaCorrente) throws ContaInexistenteException {
		return banco.consultarSaldo(contaCorrente);
	}

	public List<Transacao> consultarExtrato(ContaCorrente contaCorrente, BigDecimal valor) throws ContaInexistenteException {
		return banco.consultarExtrato(contaCorrente);
	}

	public void realizarSaque(ContaCorrente contaCorrente, BigDecimal valor) throws ContaInexistenteException, SaldoInsuficienteException {

		banco.debitarConta(contaCorrente, valor);
	}

	public void depositar(ContaCorrente contaCorrente, BigDecimal valor) throws ContaInexistenteException {
		banco.creditarConta(contaCorrente, valor);
		   
	}

	public void transferenciaContasMesmoBanco(ContaCorrente contaCorrenteDebitada, ContaCorrente contaCorrenteCreditada,
											  BigDecimal valor) throws ContaInexistenteException, SaldoInsuficienteException{

		banco.transferenciaEntreContas(contaCorrenteDebitada, contaCorrenteCreditada, valor);
	}

}
