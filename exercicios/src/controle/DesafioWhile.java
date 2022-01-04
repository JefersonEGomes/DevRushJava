package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		/*
	  
	 				-----------------To/DO----------------- 
	 1 - Criar scanner V 
	 2 - Criar Variaveis do programa V 
	 3 - Criar while para verificar a nota e adicionar valor as variaveis V 
	 4 - registar a soma das notas digitadas V 
	 5 - registrar quantas notas foram digitas V 
	 6 - calular a média V 
	 7 - sair do programa se o usuario digitar -1 V
	  
	 */

	Scanner leitor = new Scanner(System.in);
	double nota = 0;
	double contador = 0;
	double soma = 0;
	double media = 0;
	
	while (nota != -1) {
		System.out.println("Por favor digite uma nota válida abaixo: ");
		nota = leitor.nextDouble();

		if (nota >= 0 && nota <= 10) {
			contador++;
			soma = soma + nota;

		} else if (nota < -1 && nota < 0 || nota > 10) {

			System.out.println("Favor digitar uma nota válida");

		} else if (nota == -1 && contador == 0) {
			System.out.println("Aqui está sua média: 0");
		}
		
		else {

			media = soma / contador;
			System.out.println("Aqui está sua média: " + media);
			}
		}

		leitor.close();

	}
}
