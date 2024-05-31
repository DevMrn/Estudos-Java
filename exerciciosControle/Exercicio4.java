package exerciciosControle;

import java.util.Scanner;

public class Exercicio4 {

	/**
	 * 4. Criar um programa que receba um número e diga se ele é um número primo.
	 */
	
	public static void main(String[] args) {
		
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int num = entrada.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + num + " é primo.");
		} else {
			System.out.println("\nO numero " + num + " não é primo.");
		}

		entrada.close();

	}
}

	// Não consegui fazer