package classe;

// import java.io.PrintStream;

public class Data {
	/*
	Criar 3 atributos , dia mês e ano
	*/
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String dataFormatada() {
		
		return "Hoje é: "+dia+"/"+mes+"/"+ano ;
	}
	
	
	
	
//	PrintStream dataFormatada(){
//		
//		return System.out.printf("Hoje é: %d/%d/%d \n", dia, mes, ano);
//	}
//	
//	PrintStream dataFormatada(String messagem){
//		
//		return System.out.printf(messagem + " %d/%d/%d \n", dia, mes, ano);
//	}
	
}
