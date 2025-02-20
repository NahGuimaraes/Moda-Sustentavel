package moda.controller;


import java.util.ArrayList;

import moda.Produto;
import moda.model.Moda;
import moda.repository.ModaRepository;


public class ModaController implements ModaRepository{
	private ArrayList<Moda> listaProduto = new ArrayList<Moda>();
	private String nome = null;
	
	
	@Override
	public void procurarPorCodigo(int codigo) {
		var produto = buscarNaCollection(codigo);
		if (produto != null) {
		    produto.visualizar();
		} else {
		    System.out.println("Produto não encontrado!");
		}
	}

	@Override
	public void listarTodas() {
		for (var moda : listaProduto) {
			moda.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Moda produto) {
		listaProduto.add(produto);
		System.out.println("\nA Cadastrar Produto:" + produto.getNome() + "Foi criado com Sucesso!");
		
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

	@Override
	public void cadastrar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	
	private int numero = 0;

	public int gerarNumero() {
	    return ++numero;
	}
    
	public Moda buscarNaCollection(int codigo) {
	    for (var produto : listaProduto) {
	        if (produto.getCodigo() == codigo) {
	            return produto;
	        }
	    }
	    return null;
	
			
		
	}
}

