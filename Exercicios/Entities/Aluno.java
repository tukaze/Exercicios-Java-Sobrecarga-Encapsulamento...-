package entities;

public class Aluno {

	private String nome;
	private double nota1;
	private double nota2;

	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;

		if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
			throw new IllegalArgumentException("Notas devem estar entre 0 e 10");
		}

		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double media() {
		return (nota1 + nota2) / 2.0;
	}

	public String situacao() {
		if (media() >= 6.0) {
			return "APROVADO";
		} else {
			return "REPROVADO";
		}
	}

	@Override
	public String toString() {
		return "Nome: " + nome
				+ " || Média: " + String.format("%.2f", media())
				+ " || Situação: " + situacao();
	}
}
