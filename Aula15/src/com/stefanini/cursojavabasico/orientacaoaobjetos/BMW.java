package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class BMW extends Carro {
	
	public BMW() {
		super();
	}
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW Sobreescrita");
		return velocidadeFinal / tempoFinal;
	}
}
