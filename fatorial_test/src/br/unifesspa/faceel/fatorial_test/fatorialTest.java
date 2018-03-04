package br.unifesspa.faceel.fatorial_test;




import org.junit.Assert;
import org.junit.Test;
import br.unifesspa.faceel.fatorial.Fatorial;

		
//import br.unifesspa.faceel.dominio.Calculadora;
public class fatorialTest {

	
	@Test
	public void Testando() {
		Fatorial fat = new Fatorial();
		Assert.assertEquals(120, fat.calculoRecursivo(5), 0);
	}
	
}
