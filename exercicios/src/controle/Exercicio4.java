package controle;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
				
		Scanner leitor = new Scanner(System.in);
		
		int divisor = 0;
		
		System.out.println("Digite um n?mero para verificar: ");
	int num = leitor.nextInt();

	for (int i = 2 ; i < num; i++) {
		if(num % i == 0 ) {
			divisor++;
		}
	}
		
	if(divisor == 0) {
		System.out.println("primo");
	}else {
		System.out.println("a");
		}
		
		leitor.close();
	}
}
