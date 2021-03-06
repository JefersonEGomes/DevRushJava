package fundamentos;

public class TiposPrimitivosExercicio {
	public static void main(String[] args) {
		// Informa??es do funcionario
		
		// Tipos num?rico inteiro
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		// para definir um long que ultrapassa o tamanho do inteiro voc? precisa coloca a letra L no final do mumero
		long pontosAcumulados = 3234845223L;
		
		// Tipos num?ricos reais
		// Mesma l?gica do long
		float salario = 11445.44F;
		double vendasAcumuladas = 2991797103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		// Tipo caractere
		char status = '?'; // Aceita um unico caractere
		
		// Dias de empresa
		System.out.println("Dias Trabalhados:" + anosDeEmpresa * 365 +" dias");
		
		// N?mero de viagens 
		System.out.println("N?mero de viagens feitas: " + numeroDeVoos / 2 +" viagens");
		
		// Pontos por real
		System.out.println("Pontos por real: "+pontosAcumulados / vendasAcumuladas +" pontos");
		
		System.out.println(id + ": ganha -> R$" + salario);
		System.out.println("F?rias ?" + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
