package controle;

import java.util.Scanner;

public class Exercicio1 {
	/*
	  Criar um programa que receba um n�mero e verifique se ele est� entre 0 e 10 e
	  � par
	 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Por favor digite um n�mero: ");
		int i = leitor.nextInt();

		if (i >= 0 && i <= 10 && i % 2 == 0) {
			System.out.printf("O n�mero %d est� entre 0 e 10 e � par", i);
		} else if (i >= 0 && i <= 10 && i % 2 != 0) {
			System.out.printf("O n�mero %d est� entre 0 e 10 e n�o � par", i);
		} else if (i < 0 || i > 10 && i % 2 != 0) {
			System.out.printf("O n�mero %d n�o est� entre 0 e 10 mas n�o � par", i);
		} else if (i < 0 || i > 10 && i % 2 == 0) {
			System.out.printf("O n�mero %d n�o est� entre 0 e 10 mas � par", i);
		} else {
			System.out.println("Por favor digite um n�mero v�lido");
		}
		leitor.close();

	}
}
