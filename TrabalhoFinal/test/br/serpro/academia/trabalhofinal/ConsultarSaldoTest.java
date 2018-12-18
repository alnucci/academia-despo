package br.serpro.academia.trabalhofinal;

import br.serpro.academia.trabalhofinal.banco.Banco;
import br.serpro.academia.trabalhofinal.banco.ContaCorrente;
import org.junit.Test;

public class ConsultarSaldoTest {

    @Test
    public void consultarSaldoComSucesso(Banco banco, ContaCorrente conta) {
        contaCorrente = new ContaCorrente(166, 41050L, 400.00);

    }
/*
        @Test
    public void deveConsultarSaldoTotal() {

        // Given
        ContaCorrente contaCorrente = new ContaCorrente();

        // When
        contaCorrente.depositar(100.0);

        try {
            contaCorrente.realizarSaque(100.0);
        } catch (SaldoInsuficienteException exception) {
            fail("Deveria permitir efetuar retirada com valor menor que saldo total");
        }

        // Then
        assertEquals(50.0, contaCorrente.consultarSaldo(), 0);
    }

    @Test
    public void devePermitirComValorIgualAoSaldoTotal() {

        // Given
        ContaCorrente contaCorrente = new ContaCorrenteComum();

        // When
        contaCorrente.depositar(100.0);
        try {
            contaCorrente.realizarSaque(100.0);
        } catch (SaldoInsuficienteException exception) {
            fail("Deveria permitir efetuar retirada com valor igual que saldo total");
        }

        // Then
        assertEquals(0.0, contaCorrente.consultarSaldo(), 0);
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void naoDevePermitirSaqueSuperiorAoValorDepositado() throws SaldoInsuficienteException {

        // Given
        ContaCorrente contaCorrente = new ContaCorrenteComum();

        // When
        contaCorrente.depositar(50.0);
        contaCorrente.realizarSaque(50.01);

    }
*/
}
