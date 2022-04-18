package fi.unju.edu.ar.puntoDieciseis;

public class CalculoMatematico {

	private int n;

	public CalculoMatematico(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int calcularSumatoria() {

		int sumatoriaN = 0;

		for (int i = 0; i <= this.n; i++) {
			sumatoriaN += i;
		}

		return sumatoriaN;
	}

	public int calcularProductoria() {

		int productoria = 1;

		for (int i = 1; i <= this.n; i++) {
			productoria *= i;
		}

		return productoria;
	}

}
