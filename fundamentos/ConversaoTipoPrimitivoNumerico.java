package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.0; // Forma de converter (Explícita)
		System.out.println(b);
		
		int c = 127;
		byte d = (byte) c; // explícita
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}

/* Para conversão de forma explicita 
 * basta por a primeira letra da váriavel no final
 * EX: float b = 1.0F; o F foi para dizer que é do tipo float
 */