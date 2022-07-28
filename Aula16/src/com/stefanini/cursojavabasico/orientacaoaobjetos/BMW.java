package com.stefanini.cursojavabasico.orientacaoaobjetos;

import com.stefanini.cursojavabasico.orientacaoaobjetos.Carro;

public class BMW extends Carro implements Conversivel, Utilitario {

	public BMW() {
		super();
	}

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW Sobreescrita");
		return velocidadeFinal / tempoFinal;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("BMW Piscando alerta...");
	}

	@Override
	public void acionarTurbo() {

	}

	@Override
	public void passear() {

	}

	@Override
	public void abrirCapo() {

	}
}
