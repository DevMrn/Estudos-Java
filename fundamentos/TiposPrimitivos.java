// Tipos de váriaveis

package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.45F;
		double  vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println("Dias de serviço: " + anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println("Viajou: " + numeroDeVoos / 2 + "x");
		
		// Pontos por real
		System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);
		System.out.println("Funcionário: " + id + " recebe -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
	/* anos de empresa, numero de voos,
	 * id, pontos acumulados,
	 * esta de férias, status (ativo ou parado), 
	 * 
	 * anos de empresa * 365 (total dias)
	 * numero de voos / 2
	 * acumulados / vendas
	 * id recebe salario
	 * esta de ferias
	 * status
	 * */