package entities;

public class Pedido {

	private int numero;
	private String cliente;
	private double valorTotal;

	public Pedido(int numero, String cliente) {

		this.numero = numero;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValorTotal() {

		return valorTotal;
	}

	public void adicionarValor(double valor) {

		if (valor < 0) {

			throw new IllegalArgumentException("Valor não pode ser Negativo!!!");

		} else {

			valorTotal += valor;

		}

	}

	public String toString() {

		return "Pedido: " + numero + " || " + "Cliente: " + cliente + " || " + "Valor Total: R$"
				+ String.format("%.2f", valorTotal);

	}

}
