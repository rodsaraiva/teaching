package com.github.rsaraiva.teaching.lojinha.bancodedados;

import com.github.rsaraiva.teaching.lojinha.model.Produto;

public interface BancoDeDados {

	/**
	 * Insere o produto especificado
	 * @param produto
	 */
	void insert(Produto produto);

	/**
	 * Apaga o produto com id especificado
	 * @param id
	 * @return Produto
	 */
	Produto get(Integer id);

	/**
	 * Modifica um produto para o produto especificado
	 * @param produto
	 */
	void update(Produto produto);

	/**
	 * Apaga o produto com id especificado
	 * @param id
	 */
	void delete(Integer id);
}
