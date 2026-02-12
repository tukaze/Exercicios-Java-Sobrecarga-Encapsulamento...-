package Main;

import java.util.Locale;
import java.util.Scanner;

import Entities.Carro;

public class EXCARRO {
    
public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Modelo do Carro: ");
		String modelo = sc.nextLine();
		System.out.println("Qual ano do Carro: ");
		int ano = sc.nextInt();
		System.out.println();

		Carro carro = new Carro(modelo, ano);

		System.out.println("-----------------VOCE LIGOU O CARRO-----------------");
		System.out.println("-----------------VRUMMMMMMMMMMMMMMM-----------------");
		System.out.println(carro);
		System.out.println();
		System.out.println("Quanto vai acelerar (Km/h):  ");
		int velocidade = sc.nextInt();
		carro.acelerar(velocidade);
		System.out.println();
		System.out.println(carro);

		System.out.println("Quanto vai frear (Km/h):  ");
		velocidade = sc.nextInt();
		carro.frear(velocidade);

		System.out.println(carro);

		sc.close();
	}

}





