package controle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	/*Criar um programa,a para verificar as notas e seus conceitos*/
	public static void main(String[] args) {
		Scanner  leitor = new Scanner(System.in).useLocale(Locale.US);
		System.out.println();
		double nota1 = leitor.nextDouble();
		double nota2 = leitor.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.printf("Sua m?dia ? %.2f e voc? est? Aprovado",media);
		}else if(media >= 4.0 && media < 7.0 ) {
			System.out.printf("Sua m?dia ? %.2f e voc? est? Recupera??o",media);
		}else {
			System.out.printf("Sua m?dia ? %.2f e voc? est? Reprovado",media);
		}
		
		
		leitor.close();
	}
}
