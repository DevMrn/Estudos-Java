package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		d1.dia = 21;
		d1.mes = 05;
		d1.ano = 2007;
		
		var d2 = new Data();
		
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2020;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.printf(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
