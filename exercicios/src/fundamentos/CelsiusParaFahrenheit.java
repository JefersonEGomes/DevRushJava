package fundamentos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		
		System.out.println("Digite aqui a temperatura que deseja converter de celsius para fahrenheit: ");
		double c = temp.nextDouble();
		
		double formula = (c * 1.8) + 32;
		
		System.out.println(formula + " ║Fahrenheit");
		
		
		
		temp.close();
	}

}
