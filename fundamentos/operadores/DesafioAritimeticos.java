package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		// Desafio
		
		int numA = 6 * (3 + 2);
		double elevacaoQuadradoA = Math.pow(numA, 2);
		double denA = elevacaoQuadradoA / (3 * 2);
		int numB = (1 - 5) * (2 - 7);
		double denB = numB / 2;
		double elevacaoQuadradoB = Math.pow(denB, 2);
		double parentesisG = denA - elevacaoQuadradoB;
		double divisaoInferior = Math.pow(parentesisG, 3);
		int inferior = 10;
		double inferiorElevado = Math.pow(inferior, 3);
		double resultado = divisaoInferior / inferiorElevado;
		
		System.out.println(resultado);
	}
}


// Resolução do Curso

/*
 *	double numA = Math.pow(6 * (3 + 2), 2);
 *	double denA = 3 * 2; 
 *	
 *	double numB = (1 - 5) * (2 - 7);
 *	double denB = 2;
 *
 *	double superiorA = numA / denA;
 *	double superiorB = Math.pow(numB / denB, 2);
 *
 *	double superior = Math.pow(superiorA - superiorB, 3);
 *	double inferior = Math.pow(10, 3);
 *
 *	double resultado = superior / inferior;
 *
 *	System.out.println("O resultado é: " + resultado);
 */