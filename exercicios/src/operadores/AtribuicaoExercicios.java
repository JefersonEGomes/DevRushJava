package operadores;

public class AtribuicaoExercicios {
	
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a+b;
		
		c += b; // c = c + b;
		c -= a; // c = c - b;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		c %= 2; // c = c % 2; -> retorna o resto da divis?o (divis?o modulo)
		
		System.out.println(c);
	}
}
