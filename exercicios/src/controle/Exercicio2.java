package controle;

import java.util.Scanner;

public class Exercicio2 {
	/*Criar um programa que informa  se o ano atual ? um ano bissexto*/ 
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o ano que deseja verificar: ");
		int ano = leitor.nextInt();
		
		if(ano %4 == 0) {
			System.out.printf("%d ? um ano bissexto",ano);
		}else {
			System.out.printf("%d n?o ? um ano bissexto",ano);
		}
		
		leitor.close();
	}
}
