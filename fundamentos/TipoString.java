package fundamentos;

public class TipoString {

		public static void main(String[] args) {
			
			System.out.println("Olá pessoal".charAt(2));
			
			String s = "Boa tarde"; // A String é imutável
			System.out.println(s.concat("!!!"));
			System.out.println(s + ("!!!"));
			System.out.println(s.startsWith("Boa")); // Diz se começa com a palavra ou não
			System.out.println(s.toLowerCase().startsWith("boa")); // LowerCase é pra deixar tudo minusculo e UpperCase tudo maiusculo
			System.out.println(s.toUpperCase() .endsWith("TARDE")); // Diz se acaba com a palavra ou não
			System.out.println(s.length()); // Diz quantas palavras tem a variavel
			System.out.println(s.toLowerCase() .equals("boa tarde")); // Compara a variavel com o texto
			System.out.println(s.equalsIgnoreCase("boa tarde")); // Ignora letras maiusculas
			
			var nome = "Pedro";
			var sobrenome = "Santos";
			var idade = 33;
			var salario = 12345.987;
			
			System.out.println("Nome: " + nome +
					"\nSobrenome: " + sobrenome +
					"\nIdade: " + idade +
					"\nSalário: " + salario + "\n\n"); // O "\n" quebra a linha
			
			System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", 
					nome, sobrenome, idade, salario); // o "%s" imprime o nome da variavel
			
			String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f", 
					nome, sobrenome, idade, salario); // Armazenei tudo em uma variavel
			System.out.println(frase);
			
			System.out.println("Frase qualquer".contains("qual"));
			System.out.println("Frase qualquer".indexOf("qual"));
			System.out.println("Frase qualquer".substring(6));
			System.out.println("Frase qualquer".substring(6, 10));
		}
}
