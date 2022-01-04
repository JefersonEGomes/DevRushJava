package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		// if(...) setença ou {}
		// while(...) setença; ou {}
		// for(..;...;...) setença ; ou {}
		// do {} while(...);
		String texto = "";
		
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.println("Quer sair?");
			 texto = leitor.nextLine();
		} while (!texto.equalsIgnoreCase("sim"));
		leitor.close();
	}
}
