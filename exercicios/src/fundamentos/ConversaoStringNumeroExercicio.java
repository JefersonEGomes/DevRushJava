package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumeroExercicio {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite aqui a sua primeira m�dia semestral");
		String valor2 = JOptionPane.showInputDialog("Digite aqui a sua Segunda m�dia semestral");
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;
		double media = soma/2;
		
		System.out.println("Aqui est� sua soma de semestres: " + soma);
		System.out.printf("Aqui est� sua media anual: " + media);
	}
}
