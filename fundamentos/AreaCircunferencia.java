package fundamentos;

public class AreaCircunferencia 
{
	public static void main(String[] args) 
	{
		
		double raio = 3.4;
		final double PI = Math.PI;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m².");
		
	}
}

// O (final) é para que o valor da váriavel não seja alterado.
// Eu substitui o valor do raio na linha 14 até a 15.