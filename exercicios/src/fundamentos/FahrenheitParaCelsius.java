package fundamentos;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		
		System.out.println("Digite a temperatura que deseja converter de Fahrenheit para Celsius:  ");
		double f = temp.nextDouble();
		
		double formula = (( f - 32)*5/9);
		System.out.println(formula + " �Celsius");
		temp.close();
	}
}
