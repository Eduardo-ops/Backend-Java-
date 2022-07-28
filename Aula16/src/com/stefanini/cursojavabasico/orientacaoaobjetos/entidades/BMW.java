package com.stefanini.cursojavabasico.orientacaoaobjetos.entidades;

import com.stefanini.cursojavabasico.orientacaoaobjetos.Carro;

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
