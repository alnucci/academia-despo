package br.serpro.academia.trabalhofinal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TrabalhoFinalTest 
    extends TestCase
{
    /**
     * Parte 1

       Caixa 24h

      Um Caixa 24h deve ser capaz de acessar diferentes Bancos desconhecidos e realizar as seguintes operações básicas na conta do usuário:

      Consultar extrato
      Consultar Saldo
      Realizar Transferência (no mesmo banco)
      Realizar Depósito
      Saque
      Nenhuma operação pode ser realizada se deixar o saldo abaixo do limite
      */
	
	@Test
	public void consultarExtrato();
	
	@Test
	public void consultarSaldo();
	
	@Test
	public void realizarTransferenciaMesmoBanco();
	
	@Test
	public void realizarDeposito();
	
	@Test
	public void realizarSaque();
	
	
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TrabalhoFinalTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TrabalhoFinalTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
