package ec.model;

public abstract class Produto {

	private int codigo;
	private String produto;
	private Float preco;
	
	
	public Produto(int codigo, String produto, Float preco) {
		this.codigo = codigo;
		this.produto = produto;
		this.preco = preco;
	
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public Float getPreco() {
		return preco;
	}


	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
}