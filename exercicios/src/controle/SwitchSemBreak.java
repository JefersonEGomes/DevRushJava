package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("N�o sei nada");
		
		}
		System.out.println();
		
		int nivel = 3;
		
		switch(nivel) {
		case 3:
			System.out.println("Sabe Programar");
		case 2:
			System.out.println("Sabe escrever um c�digo b�sico");
		case 1:
			System.out.println("Sabe ler um c�digo");
		case 0:
			System.out.println("Sabe copiar um c�digo");
		}
	}
}
