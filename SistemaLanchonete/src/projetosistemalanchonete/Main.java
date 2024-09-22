package projetosistemalanchonete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		try {
			Pizza pizza1 = new Pizza("Pizza de Calabresa", "Tomate", "Calabresa", "Requeijão");
			Pizza pizza2 = new Pizza("Pizza Portuguesa", "Tomate", "Portuguesa", "Catupiry");
			Pizza pizza3 = new Pizza("Pizza Frango com Catupiry", "Tomate", "Frango desfiado", "Requeijão");

			Lanche lanche1 = new Lanche("Hamburguer", "Pão de hamburguer", "Carne de hamburguer", "Barbecue");
			Lanche lanche2 = new Lanche("X Salada", "Pão de hamburguer", "Carne de hamburguer", "Nenhum");

			Salgadinho salgado1 = new Salgadinho("Coxinha de frango", "Frango Catupiry", "Massa de trigo");
			Salgadinho salgado2 = new Salgadinho("Risole de carne", "Carne", "Massa de trigo");
			Salgadinho salgado3 = new Salgadinho("Risole de queijo e presunto", "Queijo e presunto", "Massa de trigo");

			Pedido pedido = new Pedido();

			JOptionPane.showMessageDialog(null, "Bem vindo a lanchonete Quase Três Lanches! ");
			String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ");

			pedido.setNomeCliente(nome);

			boolean menu = true;
			while (menu) {

				String input = JOptionPane.showInputDialog(null,
						"Faça o seu pedido: \n 1-" + pizza1.getTitulo() + "| R$ " + pizza1.calcularPreco() + " \n 2-"
								+ pizza2.getTitulo() + "| R$ " + pizza2.calcularPreco() + "\n 3-" + pizza3.getTitulo()
								+ "| R$ " + pizza3.calcularPreco() + "\n 4-" + lanche1.getTitulo() + "| R$ "
								+ lanche1.calcularPreco() + " \n 5-" + lanche2.getTitulo() + "| R$ "
								+ lanche2.calcularPreco() + " \n 6-" + salgado1.getTitulo() + "| R$ "
								+ salgado1.calcularPreco() + "\n 7-" + salgado2.getTitulo() + "| R$ "
								+ salgado2.calcularPreco() + "\n 8-" + salgado3.getTitulo() + "| R$ "
								+ salgado3.calcularPreco());

				int opcao = Integer.parseInt(input);

				switch (opcao) {
				case 1:
					pedido.adicionarPrato(pizza1);
					break;

				case 2:
					pedido.adicionarPrato(pizza2);
					break;

				case 3:
					pedido.adicionarPrato(pizza3);
					break;

				case 4:
					pedido.adicionarPrato(lanche1);
					break;

				case 5:
					pedido.adicionarPrato(lanche2);
					break;

				case 6:
					pedido.adicionarPrato(salgado1);
					break;

				case 7:
					pedido.adicionarPrato(salgado2);
					break;
				case 8:
					pedido.adicionarPrato(salgado3);
					break;

				case 0:
					JOptionPane.showMessageDialog(null, "Imprimindo fatura");

					pedido.mostrarFatura();

					menu = false;
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
					break;

				}

			}

			boolean pagamento = false;
			while (pagamento == false) {

				JOptionPane.showMessageDialog(null, "Valor a ser pago: " + pedido.calcularTotal());
				String pag = JOptionPane.showInputDialog(null, "Insira o valor a ser pago: ");

				double valor = Double.parseDouble(pag);

				pedido.calcularTroco(valor);

				if (valor < pedido.calcularTotal()) {
					JOptionPane.showMessageDialog(null, "Valor a ser pago inválido");
				} else if (valor > pedido.calcularTotal()) {
					JOptionPane.showMessageDialog(null, "O seu troco é de: " + pedido.calcularTroco(valor) + " R$");

					pagamento = true;

					JOptionPane.showMessageDialog(null, "Pagamento realizado!");
					JOptionPane.showMessageDialog(null, "Volte sempre! :)");
				}

			}
		} catch (Exception e) {
			System.out.println("Opss! Ocorreu alguma falha em nosso sistema. Aguarde uns instantes.");
			e.printStackTrace();
		}

	}

}
