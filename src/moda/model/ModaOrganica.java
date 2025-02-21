package moda.model;

public class ModaOrganica extends Moda {

	private boolean eSustentavel;
    private String material;

    public ModaOrganica (int gerarCodigo, String nome, String descricao, float preco, boolean eSustentavel, String material) {
        super(gerarCodigo, nome, descricao, preco);
        this.eSustentavel = eSustentavel;
        this.material = material;
    }




	public ModaOrganica(int gerarCodigo, String string, String string2, float f, String string3, int i,
			String string4, boolean eSustentavel, String material) {
		super(gerarCodigo, getNome(), getDescricao(), getPreco());
        this.eSustentavel = eSustentavel;
        this.material = material;
	}




	public boolean iseSustentavel() {
        return eSustentavel;
    }

    public void seteSustentavel(boolean eSustentavel) {
        this.eSustentavel = eSustentavel;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("É Sustentável: " + this.eSustentavel);
        System.out.println("Material: " + this.material);
    }
}