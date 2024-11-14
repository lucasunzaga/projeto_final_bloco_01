package ec_Repository;

import ec.model.Produto;

public interface EC_Repository {

	public void Adicionar(Produto produto);
	public void listarProdutos();
	public void Editar(int codigo, String novoProduto, float novoPreco);
	public void Excluir(int codigo);
}
