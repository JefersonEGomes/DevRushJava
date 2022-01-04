package operadores;

public class UnariosExercicios {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		System.out.println("Incrementando: "+ a);
		
		a--; // a = a - 1
		System.out.println("Decrementando: "+ a);
		
		
		++b; // b = b + 1
		System.out.println("Incrementando: "+ b);
		
		--b; // b = b - 1
		System.out.println("Decrementando: "+ a);
		
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
