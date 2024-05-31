package exerciciosFundamentos;

import java.util.Scanner;

public class SwitchSemBreakTest {

public static void main(String[] args) {
		
		// if(bool) ...
		// while(bool) ...
		// for(;bool;) ...
		
	Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite sua faixa: ");
		String faixa = entrada.next();
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
				
		}
		
		System.out.println("Fim!");
		
		System.out.println("Digite a idade: ");
		
		int idade = entrada.nextInt();
		switch (idade) {
		case 3: 
			System.out.println("Sabe programar");
		case 2: 
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
		
		entrada.close();
	}
}

	// Break stoppa a impressão.