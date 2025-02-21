package moda.model;

import moda.Produto;

public class ModaReciclavel extends Produto {

	private int quantidadeReciclada;
    private String materialReciclado;

    public ModaReciclavel(int gerarCodigo, String nome, String descricao, float preco, String string,
			int quantidadeReciclada2, int i, String materialReciclado2, int quantidadeReciclada, String materialReciclado) {
        super(gerarCodigo, nome, descricao, preco);
        this.quantidadeReciclada = quantidadeReciclada;
        this.materialReciclado = materialReciclado;
    }



	public int getQuantidadeReciclada() {
        return quantidadeReciclada;
    }

    public void setQuantidadeReciclada(int quantidadeReciclada) {
        this.quantidadeReciclada = quantidadeReciclada;
    }

    public String getMaterialReciclado() {
        return materialReciclado;
    }

    public void setMaterialReciclado(String materialReciclado) {
        this.materialReciclado = materialReciclado;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Quantidade Reciclada: " + this.quantidadeReciclada);
        System.out.println("Material Reciclado: " + this.materialReciclado);
    }

    public boolean reciclar(int quantidade) {
        if (this.getQuantidadeReciclada() < quantidade) {
            System.out.println("\n Quantidade insuficiente para reciclar!");
            return false;
        }
        this.setQuantidadeReciclada(this.getQuantidadeReciclada() - quantidade);
        return true;
    }

}
