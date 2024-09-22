package projetosistemalanchonete;

public class Salgadinho extends Prato {

	private String recheio;
	private String massa;

	public Salgadinho(String titulo, String recheio, String massa) {
		this.titulo = titulo;
		this.recheio = recheio;
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	@Override
	public double calcularPreco() {
		double preco = 2.50;

		return preco;
	}

}
