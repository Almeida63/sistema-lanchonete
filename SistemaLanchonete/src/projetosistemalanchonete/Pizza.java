package projetosistemalanchonete;

public class Pizza extends Prato {

	private String molho;
	private String recheio;
	private String borda;

	public Pizza(String titulo, String molho, String recheio, String borda) {
		this.molho = molho;
		this.recheio = recheio;
		this.borda = borda;
		this.titulo = titulo;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	@Override
	public double calcularPreco() {
		double preco = 15.50;

		if (borda == "Catupiry") {
			preco = preco + 2.00;
		} else if (recheio == "Portuguesa" || recheio == "Paulistana") {
			preco = preco + 5.10;
		} else if (recheio == "Chocolate") {
			preco = preco + 6.00;
		}

		return preco;
	}

}
