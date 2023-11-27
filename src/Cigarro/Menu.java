package Cigarro;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                ADEGA DO DAN                         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Cigarro                    ");
			System.out.println("            2 - Listar todos os Cigarros             ");
			System.out.println("            3 - Buscar Cigarro por ID                ");
			System.out.println("            4 - Atualizar Produtos do estoque        ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			

			opcao = scanner.nextInt();

			if (opcao == 6) {
				System.out.println("\nObrigado por usar o nosso estoque!");
				sobre();
                 scanner.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionar Cigarro\n\n");

					break;
				case 2:
					System.out.println("Listar todos os Cigarros\n\n");

					break;
				case 3:
					System.out.println("Consultar Cigarros - por ID\n\n");

					break;
				case 4:
					System.out.println("Atualizar produtos do estoque\n\n");

					break;
				case 5:
					System.out.println("Apagar o Produto\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("\n****************");
		System.out.println("VOLTE SEMPRE :)");
		System.out.println("****************");
	}
}

