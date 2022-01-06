package controle;

import java.util.Scanner;

/* Desafio  digitar uma String referente a um dia da semana e
 retornar um inteiro referente ao dia em uma sequ�ncia de 1 a 7
 */
public class DesafioDiaDaSemana {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o dia que voc�e deseja verificar: ");
		String dia = leitor.next();
		/*
		 Tips & Tricks
		 
		 Utilizar a fun��o .equalsIgnoreCase() 
		 
		 */
		
		if(dia.isEmpty()) {
			System.out.println("Por favor preencha com um dia v�lido");
		} else if(dia.toLowerCase().equals("domingo")) {
			System.out.println("Domingo - 1");
		} else if(dia.toLowerCase().equals("segunda")) {
			System.out.println("Segunda - 2");
		} else if(dia.toLowerCase().equals("ter�a")) {
			System.out.println("Ter�a - 3");
		} else if(dia.toLowerCase().equals("quarta")) {
			System.out.println("Quarta - 4");
		} else if(dia.toLowerCase().equals("quinta")) {
			System.out.println("Quinta - 5");
		} else if(dia.toLowerCase().equals("sexta")) {
			System.out.println("Sexta - 6");
		} else {
			System.out.println("S�bado - 7");
		}
		
		leitor.close();
	}
}
