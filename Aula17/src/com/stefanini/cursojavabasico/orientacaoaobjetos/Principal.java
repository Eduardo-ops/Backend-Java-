package com.stefanini.cursojavabasico.orientacaoaobjetos;

import com.stefanini.cursojavabasico.orientacaoaobjetos.entidades.*;

public class Principal {
	static int valor = 10;

	static void print() {
		System.out.println("valor");
	}

	public static void main(String[] args) {

		valor = 10;
		print();

		Carro bmw = new Carro();
		bmw.setMarca("BMW");
		bmw.setModelo("M3");
		bmw.setQuilometrosPorLitro(7.5);
		bmw.setTaxaAceleracao(50);

//		BMW bmwTres = null;
//		
//		bmwTres.acelerar();

		try {
			bmw.setVelocidadeMaxima(10);
		} catch (NegocioException e) {
			System.out.println(e);
		} finally {
			System.out.println("Passou aqui");
		}

		Carro mercedes = new Carro("Mercedes", "c180");

		BMW bmwDois = new BMW();
		Tesla tesla = new Tesla();
		tesla.isDirigeSozinho();

		Carro teslaDois = new Tesla();
		((Tesla) teslaDois).setDirigeSozinho(true);
		System.out.println(((Tesla) teslaDois).isDirigeSozinho());

		Carro[] carros = new Carro[] { bmw, bmwDois, tesla, teslaDois };

		for (Carro carro : carros) {
			if (Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
				System.out.println("Carro de marca famosa");
			}
			if (carro instanceof Tesla) {
				System.out.println(((Tesla) carro).isDirigeSozinho());
			}
		}

		Calcular.soma(1, 1);

//		Constantes.MARCA_FAMOSA = "Porche";

		bmwDois.calcularTaxaAceleracao(100.50, 10);
		teslaDois.calcularTaxaAceleracao(100.50, 10);

		System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));

		System.out.println(mercedes.getMarca());
		System.out.println(mercedes.getModelo());

		System.out.println(bmw.getMarca());
		System.out.println(bmw.getModelo());
		System.out.println(bmw.getQuilometrosPorLitro());
		System.out.println(bmw.getTaxaAceleracao());
		System.out.println(bmw.getVelocidadeMaxima());

		bmw.acelerar();
		bmw.frear();

		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5));
		System.out.println(bmw.calcularTaxaAceleracao(100, 5));
	}

}
