package controle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que receba numeros positivos e imprima a soma , caso receba
		 * negativo encerra o programa
		 */

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o numero que voc? deseja adicionaro: ");
		int numeroDigitado = scanner.nextInt();

		int somaDosNumeros = numeroDigitado;
		
		while (numeroDigitado >= 0) {
			somaDosNumeros += numeroDigitado;
			System.out.printf("Soma: %d \n", somaDosNumeros);
			System.out.println("Digite o pr?ximo n?mero");
			numeroDigitado = scanner.nextInt();
			
			if (numeroDigitado <= 0) {
				System.out.println("Voc? digitou um n?mero negativo");
				System.out.printf("Sua ultima soma foi: %d", somaDosNumeros);

			}
		}

		scanner.close();
	}
}
