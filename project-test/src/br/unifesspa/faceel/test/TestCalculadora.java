package br.unifesspa.faceel.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.unifesspa.faceel.dominio.Calculadora;

public class TestCalculadora {

	@Test
	public void testSomarNumeroIguais() 
	{
		Calculadora cal = new Calculadora();
		
		assertEquals(4, cal.somar(2, 2), 0);
	}
	
	@Test
	public void testSomaNegativa()
	{
		assertEquals(-1, new Calculadora().somar(1, -2),0);
	}
	
	@Test
	public void testSomarNumerosDiferentes()
	{
		assertEquals(5, new Calculadora().somar(2, 3), 0);
	}
	
	@Test
	public void testSubtracaoDeDoisNumerosIguais()
	{
		assertEquals(0, new Calculadora().subtrair(2.0, 2.0),0);
	}
	
	

}
