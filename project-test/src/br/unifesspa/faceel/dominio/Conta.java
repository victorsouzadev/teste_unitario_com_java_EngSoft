package br.unifesspa.faceel.dominio;

public class Conta {
	
	private double saldo;
	
	public Conta(int i, int j, String string, String string2, String string3, double d) {
		// TODO Auto-generated constructor stub
	}

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public void depositar(double valorDeDeposito)
	{
		try {

			if (valorDeDeposito < 0)
				throw new Exception();
			
			this.saldo += valorDeDeposito;
			
		} catch (Exception e) {
			
			throw new RuntimeException();
			
		}
		
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saqueconta(int i) {
		// TODO Auto-generated method stub
		
	}

	public String pagamentoconta(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
