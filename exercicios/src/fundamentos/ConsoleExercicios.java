package fundamentos;

import java.util.Scanner;

public class ConsoleExercicios {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println( "dia!!!");
		
		System.out.printf("N?meros da Megasena: %d %d %d %d %d %d %n", 45,32,14,7,8,27);
		System.out.printf("Pr?mio Total: R$%.1f%n", 168452.325 );
		System.out.printf("Ganhador: %s", "Henrrique Soares\n");
		
		Scanner calculo = new Scanner(System.in);
		
		System.out.print("Ol?, bem vindo a somatoria , para iniciar, digite seu nome: ");
		String nome = calculo.nextLine();
		
		System.out.printf("Ok %s , vou pedir que digite dois numeros para iniciar  o calculo :) \n", nome);
		System.out.print("P.s.: Se for digitar um n?mero com casa decimais , separe por '.' pontos \n");
		System.out.printf("Digite aqui o primeiro n?mero: ");
		double num1 = calculo.nextDouble();
		
		System.out.printf("Digite aqui o segundo n?mero: ");
		double num2 = calculo.nextDouble();
		
		double soma = num1 + num2;
		System.out.printf("Aqui est? a sua soma: %.2f", soma);
		
		
		
		calculo.close();
	}
}
