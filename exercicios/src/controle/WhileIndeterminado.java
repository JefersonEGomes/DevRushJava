package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		//While Indeterminado
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite algo abaixo, para sair, digite sair");
		String input = leitor.next();
		
		while(!input.equalsIgnoreCase("sair")) {
			System.out.println(input);
			System.out.println("Digite algo abaixo, para sair, digite sair");
			input = leitor.next();
			
		}
		
		
		leitor.close();
	}
}
