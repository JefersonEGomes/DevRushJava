package operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
/*
 Expresão que foi utilizada como base para resolução do exercicio
 está localizada no Video 43 do curso Fundamentos Java,
 Orientação a Objeto do Leonardo Moura Leitão 
  */  
		
//		int a = 2 + 3 * 4;
//		int b = (int) Math.pow(a, 3);
		
		int part1 = (6*(3+2));
		int part1Elev = (int) Math.pow(part1, 2)/(3*2);
		
		int part2 = ((1-5) * (2-7));
		int part2Elev = (int) Math.pow(part2, 2)/2;
		
		int part3 = Math.abs(part1Elev - part2Elev); // valor absoluto , retira o sinal
		int part3Div = (int) Math.pow(10, 3);
		int part3Elev = (int) Math.pow(part3, 3)/part3Div;
		
		System.out.println("O Resultado da equação é : "+part3Elev);
	}

}
