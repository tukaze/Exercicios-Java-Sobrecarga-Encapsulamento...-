import java.util.Locale;
import java.util.Scanner;

import entities.Pedido;

public class EX007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero do pedido: ");

		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o Nome: ");
		String cliente = sc.nextLine();

		Pedido pedido = new Pedido(numero, cliente);
		System.out.println();
		System.out.println("-----------------------Pedido Criado------------------");
		System.out.println(pedido);
		System.out.println();
		System.out.println("Quantos valores deseja adicionar: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			System.out.println("Digite: ");
			double valorTotal = sc.nextDouble();
			pedido.adicionarValor(valorTotal);

		}
		System.out.println();
		System.out.println("---------------Pedido Total---------------");
		System.out.println(pedido);

		sc.close();
	}

}
