package fundamentos;

import java.util.Scanner;

public class QuadradoCuboValor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor que deseja ser calculado");
		double valor = leitor.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("Aqui est? o seu valor ao quadrado: %.2f \ne o seu valor ao cubo: %.2f", quadrado, cubo);
		
				
		leitor.close();
	}
}
