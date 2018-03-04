package br.unifesspa.faceel.fatorial_test;

import org.junit.Assert;
import org.junit.Test;
import br.unifesspa.faceel.fatorial.Fatorial;

public class fatorialTest {

	@Test
	public void TestNumeroIgualZero() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(1, fat.calculoNaoRecursivo(0), 0);
	}

	@Test(expected = Exception.class)
	public void TestNumeroMenorZero() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(0, fat.calculoNaoRecursivo(-200), 0);
	}

	@Test
	public void TestNumeroMaiorZero() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(120, fat.calculoNaoRecursivo(5), 0);
	}
	
	@Test
	public void TestNumeroInteiro() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(Integer.class, fat.calculoNaoRecursivo(5));
	}
	
}
