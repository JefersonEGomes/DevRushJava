package controle;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Jogo de advinha??o
		 */

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		// Instancia para gerar numeros aleatorios
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100);
		int contador = 0;


		System.out.println("Tente adivinha qual numero aleatorio foi gerado!");
		System.out.println("Digite aqui um n?mero: ");
		int numeroDigitado = scanner.nextInt();

		if (numeroDigitado == numeroAleatorio && contador == 0) {
			System.out.println("Uau voc? acertou de primeira , parab?ns");
		}

		while (numeroDigitado != numeroAleatorio && contador <= 10) {
			System.out.println("Voc? errou, digite outro n?mero: ");
			numeroDigitado = scanner.nextInt();
			contador++;

			if (numeroDigitado == numeroAleatorio) {
				System.out.printf("Parab?ns o n?mero que voc? digitou (%d)" + " ? igual ao numero aleatorio (%d)",
						numeroDigitado, numeroAleatorio);
			}

		}

		scanner.close();

	}
}
