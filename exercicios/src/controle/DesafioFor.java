package controle;

public class DesafioFor {
	public static void main(String[] args) {
		/*
		  
		  
		  
		 */
		
		
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor +="#";
//		}
		
		// Vers�o do desafio
		// N�o pode usar valor num�rico para controlar o la�o!
		
		for(String valor = "#";valor.contains("#") ^ valor.equals("######"); valor+="#") {
			System.out.println(valor);
			
			
		}
	}
}
