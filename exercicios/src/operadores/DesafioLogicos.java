package operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na ter�a(V ou F)
		// Trabalho na quinta (V ou F)
		// Se os dois trabalhos derem certo , compra televis�o de 50
		// Se s� um trabalho der certo , compra tv de 32
		// Se exclusicavamente alguma das duas televis�es forem adiquiridas , a familia toma sorvete
		// se nhuma condi��o for atendida explicar a logica negativa
		
		boolean JobTer�a = false;
		boolean JobQuinta = false;
		
		if(JobTer�a == true && JobQuinta == true) {
			System.out.println("Conseguimos concluir os dois servi�os");
			System.out.println("Portanto iremos ao shopping");
			System.out.println("Vamos comprar uma televis�o de 50 polegadas");
			System.out.println("E vamos tomar soverte :)");
		}
						
		else if(JobTer�a == true && JobQuinta == false || JobTer�a == false && JobQuinta == true ) {
			System.out.println("Conseguimos concluir apenas um servi�o");
			System.out.println("Portanto iremos ao shopping");
			System.out.println("Vamos comprar uma televis�o de 32 polegadas");
			System.out.println("E vamos tomar soverte :)");
		}
		else{
			System.out.println("N�o concluios nenhum servi�o");
			System.out.println("Portanto n�o iremos ao shopping");
			System.out.println("N�o compraremos uma televis�o");
			System.out.println("E n�o vamos tomar soverte :(");
		}
		 
	}
}
