package moda.controller;


import java.util.ArrayList;

import moda.Produto;
import moda.model.Moda;
import moda.repository.ModaRepository;


public class ModaController implements ModaRepository{

	@SuppressWarnings("unused")
	private ArrayList<Moda> listaModa = new ArrayList<Moda>();
	int numero = 0;
	
	@Override
	public void procurarPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprar(int codigo, int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolver(int codigo, int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarEstoque(int codigo, int quantidade) {
		// TODO Auto-generated method stub
		
	}

}
