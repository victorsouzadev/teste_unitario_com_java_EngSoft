package br.unifesspa.faceel.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.unifesspa.faceel.dominio.Calculadora;

public class TestCalculadoraDivisao {

	@Test
	public void testDivisaoNumerosIguais() 
	{
		assertEquals(1, new Calculadora().dividir(new Double(2), new Double(2)),0);
	}
	
	@Test(expected=RuntimeException.class)
	public void testDivisaoComDivisorZero()
	{
		assertEquals(0,new Calculadora().dividir(new Double(2), new Double(0)),0);
	}
	
	@Test
	public void testDivisaoCom12por3()
	{
		assertEquals(4,new Calculadora().dividir(new Double(12), new Double(3)),0);
	}

}
