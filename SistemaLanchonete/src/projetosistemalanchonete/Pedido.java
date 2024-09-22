package projetosistemalanchonete;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String nomeCliente;
	private double taxaDeServico;
	private List<Prato> itensConsumidos = new ArrayList<>();

	public Pedido() {
		this.itensConsumidos = new ArrayList<>();
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(double taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	public List<Prato> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(List<Prato> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

	public void adicionarPrato(Prato prato) {
		itensConsumidos.add(prato);
	}

	public double calcularTotalItens() {
		double total = 0.0;

		for (Prato prato : itensConsumidos) {
			total += prato.calcularPreco();
		}

		return total;

	}

	public double calcularTaxaDeServico() {
		return this.calcularTotalItens() * 0.10;
	}

	public double calcularTotal() {
		return this.calcularTotalItens() + this.calcularTaxaDeServico();
	}

	public void mostrarFatura() {
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("---------------------------------------------------------");
		System.out.println("Itens consumidos: ");
		for (Prato prato : itensConsumidos) {
			System.out.println(prato.getTitulo() + " R$ " + prato.calcularPreco());
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("Taxa: " + " R$ " + this.calcularTaxaDeServico());
		System.out.println("Total: " + this.calcularTotal());
	}

	public double calcularTroco(double valor) {
		double troco;

		if (this.calcularTotal() > valor) {
			troco = this.calcularTotal() - valor;
		} else {
			troco = valor - this.calcularTotal();
		}

		return troco;
	}

}
