package br.unifesspa.faceel.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.unifesspa.faceel.dominio.Conta;

public class TestConta {

	private Conta conta;
	
	@Before
	public void setup()
	{
		this.conta = new Conta();
	}
	
	@Test
	public void testDepositoNaConta()
	{
		this.conta.depositar(100);
		assertEquals(100,conta.getSaldo(),0);
	}
	
	@Test
	public void testDoisDepositosNaConta()
	{
		this.conta.depositar(100);
		this.conta.depositar(200);
		assertEquals(300,conta.getSaldo(),0);
	}
	
	@Test(expected=RuntimeException.class)
	public void testDepositoDeValorNegativo()
	{
		this.conta.depositar(-1000);
	}
	
}
