package controle;

import java.util.Scanner;

public class If {	
	public static void main(String[] args) {
		
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Informe a média: ");
			double media = leitor.nextDouble();
			
			if(media >= 7){
				System.out.println("Você passou !!!");
				System.out.println("Parabéns!");
			}
			
			if(media < 7 && media >= 4.5) {
				System.out.println("Recuperação");
			}
			
			if(media < 4.5 && media >= 0) {
				System.out.println("Reprovado");
			}
			leitor.close();
	}
}
