package ec_Controller;

import ec.model.Produto;
import ec_Repository.EC_Repository;

import java.util.ArrayList;
import java.util.List;

public class EC_Controller implements EC_Repository {
	
    private List<Produto> produtos;

    public EC_Controller() {
        produtos = new ArrayList<>();
    }

    @Override
    public void Adicionar(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    @Override
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);  
            }
        }
    }

    @Override
    public void Editar(int codigo, String novoProduto, float novoPreco) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                p.setProduto(novoProduto);
                p.setPreco(novoPreco);
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    @Override
    public void Excluir(int codigo) {
        Produto produtoToRemove = null;
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                produtoToRemove = p;
                break;
            }
        }
        if (produtoToRemove != null) {
            produtos.remove(produtoToRemove);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}