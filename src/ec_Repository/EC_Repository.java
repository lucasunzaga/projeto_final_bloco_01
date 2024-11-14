package ec_Repository;

import ec.model.Produto;

public interface EC_Repository {

	public void Adicionar(Produto produto);
	public void listarProdutos();
	public void Editar(Produto produto);
	public void Excluir(Produto produto);
}
