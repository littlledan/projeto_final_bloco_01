package Cigarro.model;

public class Vermelho extends Produto{
	
	private String filtro;

	public Vermelho(String nome, double valor, int tipo, int id, String filtro) {
		super(nome, valor, tipo, id);
		this.filtro = filtro;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	@Override
	public void visualizar() {
			super.visualizar();
			System.out.println("|O cigarro de filtro vermelho é " + this.filtro+"|");
			System.out.println("|------------------------------------------|");
	}						   

}
