package br.serpro.academia.trabalhofinal;

import br.serpro.academia.trabalhofinal.banco.ContaCorrente;
import br.serpro.academia.trabalhofinal.excecoes.SaldoInsuficienteException;
import org.junit.Test;

import static org.junit.Assert.fail;


public class Caixa24hTest {

    @Test
    public void devePermitirComValorMenorQueSaldoTotal() {

        // Given
        ContaCorrente contaCorrente = new ContaCorrente();

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