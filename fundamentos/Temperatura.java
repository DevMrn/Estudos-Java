package fundamentos;

public class Temperatura 
{
	public static void main(String[] args) 
	{
		
		final double fator = 32;
		final double ajuste = 5.0 / 9.0;
		
		double fahrenheit = 86;
		final double celsius = (fahrenheit - fator) * ajuste;
		
		System.out.println("A temperatura " + fahrenheit + "°F " 
		+ "em Celsius é: " + celsius + "°C ");
		
	}
}

// (ºF - 32) x 5/9 = ºC - fator e ajuste
// System.out.println("A temperatura é: " + celsius + "°C ");