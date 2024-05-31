package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in); // Reconhece as entradas
		
		System.out.print("Digite o seu nome: "); // Console pede o nome
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.", 
				nome, sobrenome, idade);
		
		entrada.close(); // Fechar Scanner
	}
}

// \n ou %n quebra linha