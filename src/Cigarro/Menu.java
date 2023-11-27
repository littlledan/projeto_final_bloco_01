package Cigarro;

import java.io.IOException;
import java.util.Scanner;

import Cigarro.Controller.CigarroController;
import Cigarro.model.Branco;
import Cigarro.model.Vermelho;
import Cigarro.util.Cores;


public class Menu {

	public static void main(String[] args) {
		CigarroController Produto = new CigarroController();
		
		Scanner scanner = new Scanner(System.in);
		
		String nome, filtro = "Mais forte!", filtro2 = "Mais fraco!";
		double valor;
		int opcao, tipo, id;
		
		while (true) {

			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_YELLOW_BACKGROUND 
			          		   +" _____________________________________________________ ");
			System.out.println("|                                                     |");
			System.out.println("|                ADEGA DO DAN                         |");
			System.out.println("|                                                     |");
			System.out.println("|_____________________________________________________|");
			System.out.println("|                                                     |");
			System.out.println("|            1 - Adicionar Cigarro                    |");
			System.out.println("|            2 - Listar todos os Cigarros             |");
			System.out.println("|            3 - Buscar Cigarro por ID                |");
			System.out.println("|            4 - Atualizar Produtos do estoque        |");
			System.out.println("|            5 - Apagar Produto                       |");
			System.out.println("|            6 - Sair                                 |");
			System.out.println("|                                                     |");
			System.out.println("|_____________________________________________________|");
			System.out.println("|      Entre com a opção desejada:                    |");
			System.out.println("|_____________________________________________________|" + Cores.TEXT_RESET);
			

			opcao = scanner.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.ANSI_YELLOW_BACKGROUND+Cores.TEXT_BLACK_BOLD
						          +"|---------------------------------------------------------------------|");
				System.out.println("|                  Obrigado por usar o nosso estoque!                 |");
				sobre();
                 scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			
				case 1:
					System.out.println("Adicionar Cigarro:\n\n");
					
					System.out.println("Informe o ID do Cigarro: ");
					id = scanner.nextInt();
					System.out.println("Informe a marca do Cigarro: ");
					nome = scanner.next();
					System.out.println("Informe o valor do Cigarro: ");
					valor = scanner.nextFloat();
					
					do {
						System.out.println("Digite o tipo de Cigarro (1 - Filtro Vermelho ou 2 - Filtro Branco): ");
						tipo = scanner.nextInt();
					}while(tipo < 1 && tipo > 2);
					
					switch(tipo) {
						case 1 -> {
							Produto.criarProduto(new Vermelho(nome, valor, tipo, Produto.gerarNumero(), filtro));
						}
						case 2 -> {
							Produto.criarProduto(new Branco(nome, valor, tipo, Produto.gerarNumero(), filtro2));
						}
					}
					keyPress();
					break;
				case 2:
					System.out.println("\n\t\tListar todos os Cigarros:\n");
					Produto.listarProdutos();
					keyPress();
					break;
				case 3:
					System.out.println("Consultar Cigarros - por ID:\n\n");
					
					System.out.println("Digite o ID do Cigarro: ");
					id = scanner.nextInt();
					
					Produto.consultarProdutoPorId(id);
					
					keyPress();
					break;
				case 4:
					System.out.println("Atualizar produtos ao estoque:\n\n");
					
					System.out.println("Digite o ID da conta: ");
					id = scanner.nextInt();
					
					var buscaProduto = Produto.buscarNaCollection(id);
					
					if(buscaProduto != null) {
						
						tipo = buscaProduto.getTipo();
						
						System.out.println("Informe a marca do Cigarro: ");
						nome = scanner.next();
						System.out.println("Informe o valor do Cigarro: ");
						valor = scanner.nextFloat();
						
						do {
							System.out.println("Digite o tipo de Cigarro (1 - Filtro Vermelho ou 2 - Filtro Branco): ");
							tipo = scanner.nextInt();
						}while(tipo < 1 && tipo > 2);
						
						switch(tipo) {
						case 1 -> {
							Produto.atualizarProduto(new Vermelho(nome, valor, tipo, id, filtro));
						}
						case 2 -> {
							Produto.atualizarProduto(new Branco(nome, valor, tipo, id, filtro2));
						}
						default ->{
							System.out.println("Tipo de Filtro inexistente!");
						}
					}
					}else {
						System.out.println("O Produto não foi encontrado!");
					}
					keyPress();
					break;
				case 5:
					System.out.println("Apagar o Produto.\n\n");
					
					System.out.println("Digite o ID do produto: ");
					id = scanner.nextInt();
					
					Produto.deletarProduto(id);
					keyPress();
					break;
				default:
					System.out.println(Cores.ANSI_YELLOW_BACKGROUND+Cores.TEXT_BLACK_BOLD+"\nOpção Inválida!\n");
					keyPress();
					break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println(Cores.ANSI_YELLOW_BACKGROUND+Cores.TEXT_BLACK_BOLD
				          + "|---------------------------------------------------------------------|\r\n"
				          + "|                                                                     |\r\n"
				          + "|                                                                     |\r\n"
				          + "|                                                                     |\r\n"
				          + "|                              ##  ##  ####                           |\r\n"
				          + "|                            ##  ########                             |\r\n"
				          + "|                        ####    ########                             |\r\n"
				          + "|                      ######################                         |\r\n"
				          + "|                      ####################  ##                       |\r\n"
				          + "|                      ##########################                     |\r\n"
				          + "|                  ##  ############################                   |\r\n"
				          + "|                      ############################                   |\r\n"
				          + "|                    ################################                 |\r\n"
				          + "|                    ##################################               |\r\n"
				          + "|                  ######    ##############      ######               |\r\n"
				          + "|                  ######                          ####               |\r\n"
				          + "|                  ######                      ##  ####               |\r\n"
				          + "|                    ####  ########                ####               |\r\n"
				          + "|                    ##############    ####      ######               |\r\n"
				          + "|                    ####          ######        ####                 |\r\n"
				          + "|                      ##          ##  ##        ####                 |\r\n"
				          + "|                      ####            ##        ####                 |\r\n"
				          + "|                      ##  ##  ####      ######  ##                   |\r\n"
				          + "|                        ##                      ##                   |\r\n"
				          + "|                        ##              ##########                   |\r\n"
				          + "|                        ########################                     |\r\n"
				          + "|                          ##############    ####                     |\r\n"
				          + "|                          ####            ######                     |\r\n"
				          + "|                          ######        ######                       |\r\n"
				          + "|                              ################                       |\r\n"
				          + "|                              ################                       |\r\n"
				          + "|                                  ########                           |\r\n"
				          + "|                                                                     |\r\n"
				          + "|                                                                     |\r\n"
				          + "|                                                                     |");
		System.out.println("|                              VOLTE SEMPRE :)                        |");
		System.out.println("|---------------------------------------------------------------------|"+Cores.TEXT_RESET);
	}
	
	public static void keyPress() {
		try {
			
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		}catch(IOException e) {
			
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
	}
}

