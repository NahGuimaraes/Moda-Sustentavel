package moda.repository;

import moda.Produto;
import moda.model.Moda;

public interface ModaRepository {

	// CRUD do Produto
	public void procurarPorCodigo(int codigo);
	public void listarTodas();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int codigo);

	// Métodos de Venda
	public void comprar(int codigo, int quantidade);
	public void devolver(int codigo, int quantidade);
	public void atualizarEstoque(int codigo, int quantidade);
	void cadastrar(Moda produto);
	
}
