
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class EX001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite o nome do Produto: ");
		String nome = sc.nextLine();
		System.out.println("Digite o preço do Produto: ");
		double preco = sc.nextDouble();

		Produto produto = new Produto(nome, preco);

		System.out.println(produto);

		sc.close();

	}

}
