package exerciciosControle;

import java.util.Scanner;

public class Exercicio1 {

	/**
	 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
	 * 10 e é par;
	 */
	
	public static void main(String[] args) {
		
		/**
		 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
		 * 10 e é par;
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = entrada.nextDouble();
		
		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
					System.out.println("O número " + num + " está entre 0 e 10 e é par");
				} else {
					System.out.println("O numero " + num + " está entre 0 e 10 mas não é par.");
				}
		} else {
			System.out.println("O numero " + num + " não está entre 0 e 10.");
		}
		
		entrada.close();
	}
}

	// Fiz metade e não consegui até o fim