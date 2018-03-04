package br.unifesspa.faceel.fatorial;



public class Fatorial {

	public int calculoNaoRecursivo(int parametro) {
		
		if(parametro < 0) {
			throw new RuntimeException();
		}
		
		int total = 1;
		for (int i = 1; i < parametro + 1; i++) {
			total *= i;
		}

		return total;
	}

	public int calculoRecursivo(int parametro) {
		if(parametro < 0) {
			throw new RuntimeException();
		}
		
		if (parametro == 1 || parametro == 0) {
			return 1;
		} else {

			return calculoRecursivo(parametro - 1) * parametro;
		}

	}

}
