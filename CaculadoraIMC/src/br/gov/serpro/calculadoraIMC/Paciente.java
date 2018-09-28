package br.gov.serpro.calculadoraIMC;

public class Paciente {
	private double peso;
	private double altura;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;

	}

	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}

	public String diagnostico() {
		double ResultadoIMC = calcularIMC();

		if (ResultadoIMC > 40) {
			return "Obesidade morbida";
		} else if (ResultadoIMC > 35) {
			return "Obesidade grau II";
		} else if (ResultadoIMC > 30) {
			return "Obesidade grau I";
		} else if (ResultadoIMC > 25) {
			return "Sobrepeso";
		} else if (ResultadoIMC > 18.5) {
			return "Peso normal";
		} else if (ResultadoIMC > 17) {
			return "Baixo peso";
		} else if (ResultadoIMC > 16) {
			return "Baixo peso grave";
		} else
			return "Baixo peso muito grave";
	}

}
