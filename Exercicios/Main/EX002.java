import java.util.Locale;
import java.util.Scanner;

import entities.Produto2;

public class EX002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do Produto: ");
		String nome = sc.nextLine();
		System.out.println("Digite o preço do Produto: ");
		double preco = sc.nextDouble();
		Produto2 produto = new Produto2(nome, preco);
		System.out.println(produto);
		System.out.println("--------------------------------");

		System.out.println("Deseja adicionar quantos produtos: ");
		int quantidade = sc.nextInt();

		produto.adicionarEstoque(quantidade);
		System.out.println("----------------DADOS ATUALIZADOS----------------");
		System.out.println(produto);
		System.out.println("--------------------------------");
		System.out.println("Deseja remover quantos produtos: ");
		quantidade = sc.nextInt();

		produto.removerEstoque(quantidade);
		System.out.println("----------------DADOS ATUALIZADOS----------------");
		System.out.println(produto);
		System.out.println("--------------------------------");
		System.out.println("Deseja alterar o preço: S/N ");
		sc.nextLine();
		String resp = sc.nextLine();

		if (resp.equals("S")) {

			System.out.println("Novo Valor: ");
			double novoValor = sc.nextDouble();
			produto.setPreco(novoValor);
			System.out.println("----------------DADOS ATUALIZADOS----------------");
			System.out.println(produto);

		} else {

			System.out.println(produto);

		}
		
		sc.close();
	}

}
