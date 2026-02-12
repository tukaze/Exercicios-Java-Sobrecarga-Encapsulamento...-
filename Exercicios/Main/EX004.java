import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class EX004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");

		String nome = sc.nextLine();
		System.out.println("Digite o seu salario: ");

		double salario = sc.nextDouble();
		Funcionario funcionario = new Funcionario(nome, salario);

		System.out.println("Qual a porcentagem de aumento(%): ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);

		System.out.println(funcionario);

		sc.close();
	}

}
