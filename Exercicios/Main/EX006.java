import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class EX006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Largura do Retangulo: ");
		double largura = sc.nextDouble();
		System.out.println("Digite a Altura do Retangulo: ");
		double altura = sc.nextDouble();
		Retangulo retangulo = new Retangulo(largura, altura);

		System.out.println(retangulo);

		sc.close();
	}

}
