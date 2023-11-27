package Cigarro.model;

public abstract class Produto {
	
	private String nome;
	private double valor;
	private int tipo, id;
	
	
	

	public Produto(String nome, double valor, int tipo, int id) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void visualizar() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Filtro vermelho";
		break;
		case 2:
			tipo = "Filtro Branco";
		break;
		}
		
		System.out.println("|------------------------------------|");
		System.out.println("|   Informações do produto:          |");
		System.out.println("|------------------------------------|");
		System.out.println("|  ID do Produto: " + this.id+"      |");
		System.out.println("|Marca do Cigarro: " + this.nome+"   |");
		System.out.println("|Valor em Reais: R$" + this.valor+"  |");
		System.out.println("|Tipo de filtro: " + tipo+"          |");
	}
	
	

}
