package com.github.rsaraiva.teaching.lojinha;

import com.github.rsaraiva.teaching.lojinha.bancodedados.BancoDeDados;
import com.github.rsaraiva.teaching.lojinha.bancodedados.BancoDeDadosProdutos;
import com.github.rsaraiva.teaching.lojinha.model.Produto;

public class Usuario {

	public static void main(String[] args) {

		// Implementar usando a classe ProdutoService

		// ProdutoService service = new ProdutoService();

		BancoDeDados banco = new BancoDeDadosProdutos();

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Criar um produto com id 1, chamado 'Torta de Frango' que custa 3 reais.");
		System.out.println();

		// implementar aqui
		Produto tortaDeFrando = new Produto();
		tortaDeFrando.setId(1);
		tortaDeFrando.setNome("Torta de Frango");
		tortaDeFrando.setPreco(3.0);
		banco.insert(tortaDeFrando);

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Criar um produto com id 2, chamado 'Torta de Palmito' que custa 5 reais.");
		System.out.println();

		// implementar aqui
		Produto tortaDePalmito = new Produto();
		tortaDePalmito.setId(2);
		tortaDePalmito.setNome("Torta de Palmito");
		tortaDePalmito.setPreco(5.0);
		banco.insert(tortaDePalmito);

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Pegar o produto com id 1 e exibir nome e preço");
		System.out.println();

		// implementar aqui
		Produto produto = banco.get(1);
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Modificar o nome do produto com id 2 para 'Torta de Palmito com Catupiry'");
		System.out.println();

		// implementar aqui
		Produto produto2 = banco.get(2);
		produto2.setNome("Torta de Palmito com Catupiry");
		banco.update(produto2);

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Modificar o preço do produto com id 2 para 6 reais");
		System.out.println();

		// implementar aqui
		Produto produto3 = banco.get(2);
		produto3.setPreco(6.0);
		banco.update(produto3);

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Pegar o produto com id 2 e exibir nome e preço");
		System.out.println();

		// implementar aqui

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Listar todos os produtos do banco de dados exibindo nome e preço");
		System.out.println();

		// implementar aqui

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Deletar o produto com id 1");
		System.out.println();

		// implementar aqui

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Listar todos os produtos do banco de dados exibindo nome e preço");
		System.out.println();

		// implementar aqui

	}
}
