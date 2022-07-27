package com.stefanini.cursojavabasico.estruturadecontrole;

public class Loop {
	public static void main(String[] args) {

		// while
		int count = 10;

		while (count < 10) {
			System.out.println("count: " + count);
			count++;
		}

		// do while
		int countDois = 101;

		do {
			System.out.println(countDois);
		} while (countDois < 100);

		// for normal
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}

		// for com areas ausentes
		int i = 0;

		for (; i < 100;) {
			System.out.println(i);
			i++;
		}

		// for com todas as areas ausente - Utilizado para loops infinitos.
		for (;;) {
			System.out.println("for");
		}
	}
}
