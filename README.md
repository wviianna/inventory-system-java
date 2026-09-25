# Sistema de Gerenciamento de Estoque (Java)

Projeto de estudo desenvolvido em Java para praticar lógica de programação e Programação Orientada a Objetos (POO), simulando o controle de estoque de produtos.

## 📋 Sobre o projeto

Sistema de console (terminal) que permite cadastrar produtos e gerenciar as movimentações de estoque. Os dados são armazenados em memória durante a execução do programa (não é salvo em banco de dados ainda — está nos próximos passos).

## 🛠️ Tecnologias utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Coleções (`ArrayList`)

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/wviianna/inventory-system-java.git
   ```
2. Compile os arquivos-fonte:
   ```bash
   cd inventory-system-java/src
   javac Main.java entities/Product.java
   ```
3. Execute o programa:
   ```bash
   java Main
   ```
4. Siga as instruções exibidas no console

## 🎯 Funcionalidades

* [x] Cadastro de produtos (nome, ID, preço, quantidade), com verificação de ID duplicado
* [x] Entrada de estoque (adicionar quantidade a um produto)
* [x] Saída de estoque (remover quantidade, com validação de saldo insuficiente)
* [x] Aplicar desconto percentual em um produto
* [x] Listar todos os produtos
* [x] Calcular o valor total do estoque
* [x] Listar produtos com estoque abaixo de um limite definido (alerta de estoque baixo)
* [x] Identificar o produto mais caro e o mais barato

## 📚 O que estou aprendendo com este projeto

* Lógica de programação em Java
* Conceitos de Programação Orientada a Objetos (encapsulamento, classes, atributos, métodos)
* Organização de código e boas práticas com Git/GitHub

## 🔜 Próximos passos

* Adicionar opção de remover produto do catálogo e editar seus dados
* Adicionar busca de produto por nome
* Persistir os dados em um banco de dados (SQL)
* Adicionar tratamento de exceções (ex: entradas inválidas no console)
* Criar testes automatizados

## 👤 Autor

Wallace Vianna
Estudante de Engenharia de Software
[LinkedIn](https://www.linkedin.com/in/wallacevianna01)
