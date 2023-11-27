package Cigarro.model;

public class Branco extends Produto{
	
	private String filtro2 = "Mais fraco!";

	public Branco(String nome, double valor, int tipo, int id, String filtro2) {
		super(nome, valor, tipo, id);
		this.filtro2 = filtro2;
	}

	public String getFiltro2() {
		return filtro2;
	}

	public void setFiltro2(String filtro2) {
		this.filtro2 = filtro2;
	}
	
	@Override
	public void visualizar() {
			super.visualizar();
			System.out.println("O cigarro de filtro branco é " + this.filtro2);
	}
}
