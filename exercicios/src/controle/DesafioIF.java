package controle;

public class DesafioIF {
	public static void main(String[] args) {
		double nota = 1.3;
		/* Colocar ";" ponto e virgula no fim da condicional gera um 
		 bug onde n�o  acusa nenhum erro , mas , a sua execu��o 
		 � falha (isso acontece por que o ; � uma sente�a de c�digo
		 v�lido no java , mesmo estando vazio )
		 */
		if(nota >= 9.0); { 
			System.out.println("Quadro de Honra");
			System.out.println("Parab�ns");
		}
	}
}
