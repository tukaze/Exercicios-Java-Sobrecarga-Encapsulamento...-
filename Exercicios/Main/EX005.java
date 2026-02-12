import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class EX005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do Aluno:  ");

		String nome = sc.nextLine();
		System.out.println("Digite a Nota N1 do Aluno:  ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a Nota N2 do Aluno:  ");
		double nota2 = sc.nextDouble();

		Aluno aluno = new Aluno(nome, nota1, nota2);

		System.out.println(aluno);

		sc.close();
	}

}
