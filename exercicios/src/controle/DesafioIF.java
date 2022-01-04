package controle;

public class DesafioIF {
	public static void main(String[] args) {
		double nota = 1.3;
		/* Colocar ";" ponto e virgula no fim da condicional gera um 
		 bug onde não  acusa nenhum erro , mas , a sua execução 
		 é falha (isso acontece por que o ; é uma senteça de código
		 válido no java , mesmo estando vazio )
		 */
		if(nota >= 9.0); { 
			System.out.println("Quadro de Honra");
			System.out.println("Parabéns");
		}
	}
}
