package fundamentos;

public class DesafioTemperatura {
	public static void main(String[] args) {
		double tempF = 0; // Fahrenheit
		final double SUB = 32; // Subtra��o da formula
		final double MULT = 5/9.0; // Multiplica��o da formula

		tempF = 32;
		
		double c = ((tempF - SUB) * MULT); 
		System.out.println("Aqui est� sua temperatura convertida em celsius: "+ c);
	}
}
