package Cigarro.Controller;

import java.util.ArrayList;

import Cigarro.Repository.CigarroRepository;
import Cigarro.model.Produto;

public class CigarroController implements CigarroRepository {
	
	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void criarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O Cigarro " + produto.getNome() + " foi adicionado com sucesso ao estoque!");
		
	}

	@Override
	public void listarProdutos() {
		for(var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void consultarProdutoPorId(int id) {
			var produto = buscarNaCollection(id);
			
			if(produto != null) {
				produto.visualizar();
			}else {
				System.err.println("PRODUTO NÃO CADASTRADO!!!!!!");
			}
	}

	@Override
	public void atualizarProduto(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());
		
		if(buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto " + produto.getId() + " foi adicioado com sucesso!");
		}else {
			System.err.println("\nO produto " + produto.getId() + " não foi encontrado!");
		}
		
	}

	@Override
	public void deletarProduto(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto numero " + id + " foi apagado!");
		}else 
			System.err.println("\nO produto numero: " + id + " não foi encontrado!");

	}
	public int gerarNumero() {
		return ++ id;
	}

	
	public Produto buscarNaCollection(int id) {
		for(var produto : listaProdutos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
}
