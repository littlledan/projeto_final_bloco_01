package Cigarro.Repository;

import Cigarro.model.Produto;

public interface CigarroRepository {
	public void criarProduto(Produto produto);
	public void listarProdutos();
	public void consultarProdutoPorId(int numero);
	public void atualizarProduto(int numero,Produto produto);
	public void deletarProduto(int numero);

}
