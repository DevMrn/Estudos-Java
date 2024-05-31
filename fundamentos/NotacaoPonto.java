package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); // Trocar o texto da variavel
		s = s.toUpperCase(); // Deixar tudo em letra maiuscula
		s = s.concat("!!!"); // Juntar ao texto
		
		System.out.println(s);
		
		// Juntando em uma linha só
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
		
	}
}
