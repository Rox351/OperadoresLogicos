package app;

public class Numero {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String verificarNumero() {
		// se o valor for dividido por 2 e der resto 0 e for maior que zero
		if (this.valor % 2 == 0 && this.valor > 0) {
			return "PAR POSITIVO";
		} else if (this.valor % 2 == 0 && this.valor < 0) {
			return "PAR POSITIVO";
		} else if (this.valor % 2 != 0 && this.valor > 0) {
			return "ÍMPAR POSITIVO";
		} else if (this.valor % 2 != 0 && this.valor < 0) {
			return "ÍMPAR NEGATIVO";
		} else {
			return "Nulo";
		}
	}
}
