package fundamentos;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 Desafio To/Do
 
 Criar 3 sacaneers V
 Passar 3 Strings V
 Calcualar a media entre essas strings V
 
  OBS.: o funcionario pode digitar , ou .  V
  
  objetivo somar os 3 salarios , dividir por 3 e exibir a m?dia V
  
  P.S.: C?digo feito para treinar os conceitos e concluir o desafio,
  n?o ? o unico metodo de resolu??o e/ou o mais eficiente
 */
public class DesafioConversao {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Digite aqui seu primeiro sal?rio: ");
		String valor1 = s1.nextLine();

		System.out.println("Digite aqui seu segundo sal?rio: ");
		String valor2 = s1.nextLine();

		System.out.println("Digite aqui seu terceiro sal?rio: ");
		String valor3 = s1.nextLine();

		s1.close();
		if (valor1.contains(",") || valor2.contains(",") || valor3.contains(",")) {
			valor1 = valor1.replace(",", ".");
			valor2 = valor2.replace(",", ".");
			valor3 = valor3.replace(",", ".");

		};
		double convert1 = Double.parseDouble(valor1);
		double convert2 = Double.parseDouble(valor2);
		double convert3 = Double.parseDouble(valor3);
		double soma = convert1 + convert2 + convert3;
		double media = soma / 3;

		System.out.println("Aqui est? a soma do seu sal?rio: R$" + new DecimalFormat("#,##0.00").format(soma) +" reais");
		System.out.println("Aqui est? a m?dia do seu sal?rio em 3 meses: R$" + media+ " reais");

	}
}