package projetosistemalanchonete;

public class Prato {
	protected String titulo;
	private double precoVenda;
	private String dataValidade;
	private double peso;

	public double getPrecoVenda() {
		return precoVenda;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double calcularPreco() {
		return 0.0;
	}

}
