# Projeto Sistema Lanchonete

Este projeto é uma aplicação Java que simula um sistema de pedidos para uma lanchonete, utilizando conceitos de Programação Orientada a Objetos (POO) como herança, encapsulamento e polimorfismo.

## Regras do Exercício

Este projeto é baseado em um exercício de POO. O objetivo é praticar conceitos como atributos e métodos, encapsulamento, polimorfismo e herança.

Link para o exercício: https://www.computersciencemaster.com.br/exercicio-sistema-de-lanchonete/

## Funcionalidades

- Adicionar diferentes tipos de pratos (Pizza, Lanche, Salgadinho)
- Calcular o preço total do pedido
- Mostrar fatura detalhada
- Calcular troco

## Estrutura do Projeto

- `Prato`: Classe base com atributos comuns a todos os pratos.
- `Pizza`: Herda de `Prato` e adiciona atributos específicos de pizzas.
- `Lanche`: Herda de `Prato` e adiciona atributos específicos de lanches.
- `Salgadinho`: Herda de `Prato` e adiciona atributos específicos de salgadinhos.
- `Pedido`: Gerencia os itens consumidos, calcula o total e o troco, e gera a fatura.
- `Main`: Classe principal que interage com o usuário e gerencia o fluxo do programa.
