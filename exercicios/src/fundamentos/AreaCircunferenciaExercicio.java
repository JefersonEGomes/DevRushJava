package fundamentos;

public class AreaCircunferenciaExercicio {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // final = const
		
		double area = PI*raio*raio;
		
		System.out.println("Aqui est� a sua �rea: " + area);
		
		raio = 10;
		area = PI*raio*raio;
		System.out.println(area);
	}
}
