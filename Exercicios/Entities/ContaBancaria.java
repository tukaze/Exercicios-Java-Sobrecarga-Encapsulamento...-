package entities;

public class ContaBancaria {

	private int numero;
	private String nome;
	private double saldo;
	private double taxa = 5.0;

	public ContaBancaria(int numero, String nome) {

		this.numero = numero;
		this.nome = nome;

	}

	public ContaBancaria(int numero, String titular, double depositoInicial) {
		this(numero, titular);
		deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void deposito(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public void saque(double valor) {
		if (valor > 0 && valor + taxa <= saldo) {
			saldo -= valor + taxa;
		}
	}

	public String toString() {

		return "Nª: " + numero + " || " + "Nome: " + nome + " || " + "Saldo: R$ " + String.format("%.2f", saldo);

	}

}
