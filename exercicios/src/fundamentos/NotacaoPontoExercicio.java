package fundamentos;

public class NotacaoPontoExercicio {
	public static void main(String[] args) {
		
		String s = "Bom, dia X";
		
		
		s = s.replace(",", ".");
		s = s.toUpperCase();
		s= s.concat("!!!!!");
		
		System.out.println(s);
		System.out.println("xd".toUpperCase());
		
		String y = "Bom dia X".replace("X","Jef" ).toUpperCase().concat("!!!!!!");
		System.out.println(y);
		System.out.println(s.contains(","));
		
		// Tipos primitivos não tem o operador "."
		int a =3;
		System.out.println(a);
		
	}
}
