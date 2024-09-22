package projetosistemalanchonete;

public class Lanche extends Prato {

	private String pao;
	private String recheio;
	private String molho;

	public Lanche(String titulo, String pao, String recheio, String molho) {
		this.titulo = titulo;
		this.pao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}

	public String getPao() {
		return pao;
	}

	public void setPao(String pao) {
		this.pao = pao;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	@Override
	public double calcularPreco() {
		double preco = 5.00;

		if (recheio == "Hamburguer") {
			preco = preco + 2.50;
		} else if (molho == "Barbecue") {
			preco = preco + 1.50;
		}

		return preco;
	}

}
