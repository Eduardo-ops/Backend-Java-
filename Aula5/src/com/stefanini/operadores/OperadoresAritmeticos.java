package com.stefanini.operadores;

public class OperadoresAritmeticos {
	public static void main(String[] args) {

		int soma = 10 + 5; // infix
		int subtracao = 10 - 5;
		int multiplicacao = 10 * 5;
		int divisao = 10 / 5;
		int modulo = 10 % 5;

		int a = 10;

//		a++; postfiz
//		++a; prefix

		System.out.println(++a == 11);
	}
}
