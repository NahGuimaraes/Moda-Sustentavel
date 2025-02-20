package moda.model;

public abstract class Moda {

	private int codigo;
    private String nome;
    private String descricao;
    private float preco;
    private String material;
    private boolean eSustentavel;


	public Moda(int codigo2, String nome2, String descricao2, float preco2) {
		
	}

	public void Produto (int codigo,
           String nome, 
           String descricao, 
           float preco, 
           String material, 
           boolean eSustentavel) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.material = material;
        this.eSustentavel = eSustentavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean iseSustentavel() {
        return eSustentavel;
    }

    public void seteSustentavel(boolean eSustentavel) {
        this.eSustentavel = eSustentavel;
    }

    public void visualizar() {
        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do Produto:");
        System.out.println("***********************************************************");
        System.out.println("Código do Produto: " + this.codigo);
        System.out.println("Nome do Produto: " + this.nome);
        System.out.println("Descrição do Produto: " + this.descricao);
        System.out.println("Preço do Produto: " + this.preco);
        System.out.println("Material do Produto: " + this.material);
        System.out.println("É Sustentável: " + this.eSustentavel);
    }

	public int getTipo() {
		// TODO Auto-generated method stub
		return 0;
	}
}


