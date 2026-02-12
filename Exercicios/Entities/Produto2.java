package entities;

public class Produto2 {

	private String nome;
	private double preco;
	private int quantidade;

	public Produto2(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}


	public void setPreco(double novoPreco) {
		if(novoPreco > 0) {
		this.preco = novoPreco;
		}
		}
		

		public void adicionarEstoque(int qtd) {
		if (qtd > 0) {
			this.quantidade += qtd;
		}
	}

	public void removerEstoque(int qtd) {
		if (qtd > 0 && qtd <= quantidade) {
			this.quantidade -= qtd;
		}
	}

	public String toString() {

		return "Nome: " + nome + " || " + "Preço: R$ " + String.format("%.2f", preco) + " || " + "Quantidade: "
				+ quantidade;

	}

}
