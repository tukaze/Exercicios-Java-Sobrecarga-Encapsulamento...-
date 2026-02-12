import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class EX003 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Digite o nome do Titular: ");
		sc.nextLine();
		String nome = sc.nextLine();

		ContaBancaria conta = new ContaBancaria(numero, nome);
		System.out.println("Vai ter Deposito inicial: [S/N] ");

		String resp = sc.nextLine();

		if (resp.equalsIgnoreCase("S")) {

			System.out.println("Valor: ");
			double Valor = sc.nextDouble();
			conta.deposito(Valor);
			System.out.println(conta);
		} else {

			System.out.println(conta);

		}

		System.out.println("Valor de Deposito:");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println(conta);
		System.out.println("Valor de Saque:");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println(conta);

		sc.close();
	}

}
