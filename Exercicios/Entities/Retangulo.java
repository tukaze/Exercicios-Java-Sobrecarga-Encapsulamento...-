package entities;

public class Retangulo {

	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		if (largura < 0 || altura < 0) {
			throw new IllegalArgumentException("Largura e altura devem ser maiores ou iguais a zero");
		}
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura >= 0) {
			this.largura = largura;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura >= 0) {
			this.altura = altura;
		}
	}

	public double area() {
		return largura * altura;
	}

	public double perimetro() {
		return 2 * (largura + altura);
	}

	@Override
	public String toString() {
		return "Área: " + String.format("%.2f", area())
				+ " || Perímetro: " + String.format("%.2f", perimetro());
	}
}
