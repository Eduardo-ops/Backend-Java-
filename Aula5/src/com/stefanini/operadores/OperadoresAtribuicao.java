package com.stefanini.operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {

		int a = 11; // operador de atribuicao
		int b = 5;

		b += a; // aditivo
		b -= a; // subtrativo
		b *= a; // multiplicativo
		b /= a; // diviso
		b %= a; // modular

		System.out.println(a % b);
	}
}
