package exerciciosFundamentos;

public class DadosFuncionario {
	public static void main(String[] args) {
	    // Informações do funcionário

		// Número de Identificação
		int id = 17593;
		
	    // Anos na Empresa
	    int anosDeEmpresa = 8;

	    // Número de Viagens
	    int numeroDeVoos = 214;

	    // Pontos e Vendas Acumuladas
	    int pontosAcumulados = 319_759;
	    int vendasAcumuladas = 45720;

	    // Salário
	    int salario=5200;

	    // Status Atual
	    boolean estaDeFerias = true;
	    boolean status = true; // I = Inativo / A = Ativo


	    System.out.println("Funcionário: " + id);
	    System.out.println("Salário: " + salario + "R$");
	    System.out.println("Dias Trabalhados: " + anosDeEmpresa * 365);
	    System.out.println("Viagens: " + numeroDeVoos / 2);
	    System.out.println("Comissão: " + pontosAcumulados / vendasAcumuladas + "%");
	    System.out.println("Está de férias? " + (estaDeFerias ? "Sim" : "Não"));
	    System.out.println("Status atual: " + (status ? "Inativo" : "Ativo"));

	  }
	}

/*
 * ID, Anos de empresa, Número de voos,
 * Pontos acumulados, Vendas acumuladas
 * Salário, Férias, Status (ativo ou inativo),
 */

// Cálculos

/*
 * Anos de Empresa * 365
 * Número de Voos / 2
 * Pontos / Vendas
 * Na parte de Férias e Status (estaDeFerias ? "Sim" : "Não"));
 */