package fundamentos;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Por favor digite seu peso: ");
		System.out.println("Ex.: 85,5");
		double peso = leitor.nextDouble();
		
		System.out.println("Agora digite sua altura: ");
		System.out.println("Ex.: 1,80");
		double altura = leitor.nextDouble();
		
		double formulaIMC = peso/Math.pow(altura, 2);
		
		System.out.printf("Seu IMC ?: %.2f KG",formulaIMC);
		
		leitor.close();
	
}
}
