package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		/*
		 To / Do Desafio Calculadora
		 Ler o primeiro numero V
		 Ler o segundo numero V
		 Escolher a opera??o  V
		 E realizar a opera??o V
		 Sem usar IF/ELSE - operador ten?rio V
		 
		 Resolu??o proposta no fim do c?digo
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite aqui o primeiro n?mero: ");
		double num1 = leitor.nextDouble();
		
		System.out.println("Digite o segundo n?mero: ");
		double num2 = leitor.nextDouble();
		
		
		System.out.println("\n");
		System.out.printf("Para realizar as opera??es Digite e tecle Enter: \n + para soma \n - para subtra??o \n * para multiplica??o \n / para divis?o\n");
		
		String operacao = leitor.next();
		
		var soma = operacao.equals("+") ? (double)num1 + (double) num2 : "N?o ? uma soma" ;
		var subtracao = operacao.equals("-") ? (double)num1 - (double) num2 : "N?o ? uma subtra??o" ;
		var multiplicacao = operacao.equals("*") ? (double)num1 * (double) num2 : "N?o ? uma multiplica??o" ;
		var divisao = operacao.equals("/") ? (double)num1 / (double) num2 : "N?o ? uma divis?o" ;
		
		System.out.println(soma);
		System.out.println("");
		System.out.println(subtracao);
		System.out.println("");
		System.out.println(multiplicacao);
		System.out.println("");
		System.out.println(divisao);
		System.out.println("");

		
		leitor.close();
		
		
		/* Resolu??o 
		 
		  Scanner entrada = new Scanner(System.in);
		  
		  System.out.print("Informe o primeiro n?mero: ");
		  double num1 = entrada.nextDouble();
		  
		  System.out.print("Informe o segundo n?mero: ");
		  double num2 = entrada.nextDouble();
		  
		  System.out.print("Informe a opera??o em s?mbolos: ");
		  String operacao = entrada.next();
		  
		  
		  //l?gica 
		   
		   double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		   resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		   resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		   resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		   resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		   
		   System.out.printf ("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado)
		  
		  entrada.close()
		  
		  
		  
		  
		  */
		
		
		
	}
}
