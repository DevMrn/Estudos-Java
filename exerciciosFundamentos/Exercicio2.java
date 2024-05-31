package exerciciosFundamentos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/** 2. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em °F");
		double fahrenhit = entrada.nextDouble();
		
		double conversao = (fahrenhit - 32) / 1.8;
		
		System.out.println("Valor em °C " + conversao);
		
		entrada.close();
	}
}