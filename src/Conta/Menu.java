package Conta;

import java.util.Scanner;
import Conta.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
			
			System.out.println("***************************************************************************");
			System.out.println("                                                                           ");
			System.out.println("                           BANCO DO BRAZIL com Z                           ");
			System.out.println("                                                                           ");
			System.out.println("***************************************************************************");
			System.out.println("                                                                           ");
			System.out.println("                              1 - Criar conta                              ");
			System.out.println("                              2 - Listar todas                             ");
			System.out.println("                              3 - Buscar Conta                             ");
			System.out.println("                              4 - Análisar dados                           ");
			System.out.println("                              5 - Apagar Conta                             ");
			System.out.println("                              6 - Sacar                                    ");
			System.out.println("                              7 - Depositar                                ");
			System.out.println("                              8 - Transferir                               ");
			System.out.println("                              9 - Sair                                     ");
			System.out.println("                                                                           ");
			System.out.println("***************************************************************************");
			System.out.println(" Entre na opção desejada:                                                  ");
			System.out.println("                                                                           " + Cores.TEXT_RESET);

			int answer = read.nextInt();

			if (answer == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n\nBanco do Brasil com Z");
				about();
				read.close();
				System.exit(0);
				
			} else {
				switch (answer) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n"); break;
				case 2: 
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n"); break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta\n\n"); break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta"); break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n"); break;
				case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n"); break;
				case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Deposito\n\n"); break;
				case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Tranferência entre contas\n\n"); break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida!\n"); break;
						
				}
			}
		}
	}
	
	public static void about() {
		System.out.println("***************************************************************************");
		System.out.println("Projeto desenvolvido por:                                                  ");
		System.out.println("Generation Brasil - eneration@generation.org                               ");
		System.out.println("github.com/conteudoGeneration                                              ");
		System.out.println("***************************************************************************");


	}
	
	
	
}