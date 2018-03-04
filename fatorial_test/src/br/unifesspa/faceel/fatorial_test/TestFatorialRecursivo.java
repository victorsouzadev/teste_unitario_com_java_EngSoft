package br.unifesspa.faceel.fatorial_test;

import org.junit.Assert;
import org.junit.Test;
import br.unifesspa.faceel.fatorial.Fatorial;

public class TestFatorialRecursivo {

	@Test
	public void testNumeroIgualZero() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(1, fat.calculoRecursivo(0), 0);
	}

	@Test(expected = Exception.class)
	public void testNumeroMenorZero() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(0, fat.calculoRecursivo(-200), 0);
	}

	@Test
	public void testNumeroMaiorZero() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(120, fat.calculoRecursivo(5), 0);
	}

	@Test
	public void testNumeroInteiro() {
		Fatorial fat = new Fatorial();
		boolean tipoInteiro = false;
		if ((fat.calculoRecursivo(5) % 1) == 0) {
			tipoInteiro = true;
		}
		Assert.assertEquals(true, tipoInteiro);
	}

	// Operações com números fatoriais
	@Test
	public void testDivisaoNumerosIguais() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(1, fat.calculoRecursivo(2) / fat.calculoRecursivo(2), 0);
	}

	@Test
	public void testDivisaoNumerosDiferentes() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(3, fat.calculoRecursivo(3) / fat.calculoRecursivo(2), 0);
	}

	@Test(expected = Exception.class)
	public void testDivisaoNumerosComException() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(0, fat.calculoRecursivo(3) / fat.calculoRecursivo(-20), 0);
	}

	@Test
	public void testMultiplicacao() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(36, fat.calculoRecursivo(3) * fat.calculoRecursivo(3), 0);

	}

	@Test(expected = Exception.class)
	public void testMultiplicarException() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(0, fat.calculoRecursivo(3) * fat.calculoRecursivo(-20), 0);
	}

	@Test
	public void testSoma() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(12, fat.calculoRecursivo(3) + fat.calculoRecursivo(3), 0);
	}

	@Test(expected = Exception.class)
	public void testSomaException() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(12, fat.calculoRecursivo(3) - fat.calculoRecursivo(-3), 0);
	}

	@Test
	public void testSubtracao() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(0, fat.calculoRecursivo(3) - fat.calculoRecursivo(3), 0);
	}

	@Test(expected = Exception.class)
	public void testSubtracaoException() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(0, fat.calculoRecursivo(3) - fat.calculoRecursivo(-3), 0);
	}

}
