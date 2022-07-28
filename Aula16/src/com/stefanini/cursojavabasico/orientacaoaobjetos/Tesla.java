package com.stefanini.cursojavabasico.orientacaoaobjetos;

import com.stefanini.cursojavabasico.orientacaoaobjetos.Carro;

public class Tesla extends Carro {

	private boolean dirigeSozinho;

	public Tesla() {
		super();
	}

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla Sobreescrita");
		return velocidadeFinal * tempoFinal;
	}

	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("Tesla piscando o alerta...");
	}

}
