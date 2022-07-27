package com.stefanini.cursobasicojava.orientacaoaobjetos;

public class BMW extends Carro {
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Sobreescrita");
		return velocidadeFinal / tempoFinal;
	}
}
