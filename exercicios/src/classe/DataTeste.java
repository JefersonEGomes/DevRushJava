package classe;

public class DataTeste {
	/*
	Instanciar duas datas
	*/
	
	public static void main(String[] args) {
		Data hoje = new Data();
//		hoje.dia = 10;
//		hoje.mes = 8;
//		hoje.ano = 2001; 
		
		Data dia2 = new Data(22, 11, 2003);
//		dia2.dia = 22;
//		dia2.mes = 11;
//		dia2.ano = 2003;
		
		System.out.println(hoje.dataFormatada());
		System.out.println(dia2.dataFormatada());
	}
}
