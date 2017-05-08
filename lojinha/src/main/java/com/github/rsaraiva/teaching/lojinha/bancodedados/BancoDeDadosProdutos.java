package com.github.rsaraiva.teaching.lojinha.bancodedados;

import java.util.HashMap;
import java.util.Map;

import com.github.rsaraiva.teaching.lojinha.model.Produto;

public class BancoDeDadosProdutos implements BancoDeDados {

	private Map<Integer, Produto> produtos = new HashMap<Integer, Produto>();
	
	public void insert(Produto produto) {
		produtos.put(produto.getId(), produto);
		System.out.println("BancoDeDados: Produto com id ".concat(produto.getId().toString()).concat(" inserido no banco"));
	}
	
	public Produto get(Integer id) {
		System.out.println("BancoDeDados: Pegando produto com id ".concat(id.toString()).concat(" do banco"));
		return produtos.get(id);
	}
	
	public void update(Produto produto) {
		Produto produtoAlterado = produtos.get(produto.getId());
		produtoAlterado.setId(produto.getId());
		produtoAlterado.setNome(produto.getNome());
		produtoAlterado.setPreco(produto.getPreco());
		produtos.replace(produto.getId(), produtoAlterado);
		System.out.println("BancoDeDados: Produto com id ".concat(produto.getId().toString()).concat(" modificado no banco"));
	}
	
	public void delete(Integer id) {
		produtos.remove(id);
		System.out.println("BancoDeDados: Produto com id ".concat(id.toString()).concat(" removido no banco"));
	}
}
