package entities;

public class Funcionario {

	private String nome;
	private double salario;
	

	public Funcionario(String nome, double salario) {

		this.nome = nome;

		if (salario < 0) {

			throw new IllegalArgumentException("Preço não pode ser negativo");
		} else {

			this.salario = salario;
		}
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentarSalario(double percentual) {
	    if (percentual > 0) {
	        salario += salario * percentual / 100;
	    }
	}


	public String toString() {

		return "Nome: " + nome + " || " + "Salario: R$" + String.format("%.2f", salario);

	}

}
