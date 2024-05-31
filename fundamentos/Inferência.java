package fundamentos;

public class Inferência {
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "..."
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		// c = 4.5; não pode ser trocado
		
		double d;	// variável declarada
		d = 123.65;	// valor aplicado
		System.out.println(d);
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; // inteiro
		// f = 12.01; não é um inteiro
		System.out.println(f);
	}
}