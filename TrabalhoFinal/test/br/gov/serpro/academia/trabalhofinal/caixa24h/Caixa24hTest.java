package br.gov.serpro.academia.trabalhofinal.caixa24h;

import static org.junit.Assert.fail;

import org.junit.Test;

import br.gov.serpro.academia.trabalhofinal.banco.ContaCorrente;
import br.gov.serpro.academia.trabalhofinal.excecoes.SaldoInsuficienteException;


public class Caixa24hTest {

    @Test
    public void deveconsultarSaldo() {
    	//Given
    	
    	ContaCorrente contaCorrente = new ContaCorrente(100, 200L, 100.0);
    	Caixa24h caixa24h = new Caixa24h(Banco BancoA);
    	
    	assertEquals(50.0, Caixa24h.consultarSaldo(), 0);
    }
    
    
    
    public void devePermitirComValorMenorQueSaldoTotal() {

        // Given
        ContaCorrente contaCorrente = new ContaCorrente(100, 200L, 100.0);

        // When
        contaCorrente.depositar(100.0);

        try {
            contaCorrente.realizarSaque(50.0);
        } catch (SaldoInsuficienteException exception) {
            fail("Deveria permitir efetuar retirada com valor menor que saldo total");
        }

        // Then
        assertEquals(50.0, contaCorrente.consultarSaldo(), 0);
    }
}