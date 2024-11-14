package ec.model;

public class Roupas extends Produto {
	
	private char tamanho;
    private String cor;
    private String material;
    
    public Roupas(int codigo, String produto, Float preco, char tamanho,String cor, String material ) {
		super(codigo, produto, preco);
		this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
		
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

}
