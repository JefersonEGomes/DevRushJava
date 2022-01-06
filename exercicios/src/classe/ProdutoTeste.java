package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.nome = "Teclado Mêcanico RGB";
		produto1.preco = 452.96;
		
		
		var produto2 = new Produto();
		produto2.nome = "Mouse RGB";
		produto2.preco = 215.25;
		
		
		System.out.println(produto1.nome);
		System.out.println(produto2.nome);
		
		double precoComDescontoProduto1 = produto1.precoComDesconto();
		double precoComDescontoProduto2 = produto2.precoComDesconto();
		double mediaCompras = (precoComDescontoProduto1 + precoComDescontoProduto2) / 2;
		System.out.printf("Média das compras: R$%.2f", mediaCompras);
	}
}
