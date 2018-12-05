package br.serpro.academia.trabalhofinal;

import org.junit.Test;

import static org.junit.Assert.fail;

public class RealizarSaqueTest {

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
/*
    @Test
    public void devePermitirComValorIgualAoSaldoTotal() {

        // Given
        ContaCorrente contaCorrente = new ContaCorrenteComum();

        // When
        contaCorrente.depositar(100.0);
        try {
            contaCorrente.efetuarRetirada(100.0);
        } catch (SaldoInsuficienteException exception) {
            fail("Deveria permitir efetuar retirada com valor igual que saldo total");
        }

        // Then
        assertEquals(0.0, contaCorrente.obterSaldo(), 0);
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void naoDevePermitirSaqueSuperiorAoValorDepositado() throws SaldoInsuficienteException {

        // Given
        ContaCorrente contaCorrente = new ContaCorrenteComum();

        // When
        contaCorrente.depositar(50.0);
        contaCorrente.efetuarRetirada(50.01);

    }
*/
}
