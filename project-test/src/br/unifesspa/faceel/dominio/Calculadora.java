package br.unifesspa.faceel.dominio;

public class Calculadora {

	public double somar(double primeiro, double segundo)
	{
		return primeiro + segundo;
	}
	
	public Double dividir(Double dividendo, Double divisor)
	{
		if (divisor == 0)
			throw new RuntimeException();
		
		return dividendo/divisor;
	}

	public Double subtrair(double primeiro, double segundo) {
		return primeiro - segundo;
	}
	
	
}
