package Entities;

public class Carro {

	private String modelo;
	private int ano;
	private int velocidade;

	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = 0;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void acelerar(int valor) {
		if (valor > 0) {
			velocidade += valor;
		}
	}

	public void frear(int valor) {
		if (valor > 0) {
			velocidade -= valor;
			if (velocidade < 0) {
				velocidade = 0;
			}
		}
	}

	public String toString() {
		return "Modelo: " + modelo + " || Ano: " + ano + " || Velocidade: " + velocidade + " km/h";
	}
}

