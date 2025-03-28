package Conta;

import java.util.Scanner;
import Conta.util.Cores;
<<<<<<< HEAD
=======
import Conta.model.Conta;
>>>>>>> d87a55f (Primeiro commit)

public class Menu {
	public static void main(String[] args) {

<<<<<<< HEAD
		Scanner read = new Scanner(System.in);
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
			
=======
		// Teste da Classe Conta
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();

		Scanner read = new Scanner(System.in);
		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);

>>>>>>> d87a55f (Primeiro commit)
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
<<<<<<< HEAD
			System.out.println("                                                                           " + Cores.TEXT_RESET);
=======
			System.out.println(
					"                                                                           " + Cores.TEXT_RESET);
>>>>>>> d87a55f (Primeiro commit)

			int answer = read.nextInt();

			if (answer == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n\nBanco do Brasil com Z");
				about();
				read.close();
				System.exit(0);
<<<<<<< HEAD
				
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
						
=======

			} else {
				switch (answer) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta\n\n");
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta");
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Deposito\n\n");
					break;
				case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Tranferência entre contas\n\n");
					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida!\n");
					break;

>>>>>>> d87a55f (Primeiro commit)
				}
			}
		}
	}
<<<<<<< HEAD
	
=======

>>>>>>> d87a55f (Primeiro commit)
	public static void about() {
		System.out.println("***************************************************************************");
		System.out.println("Projeto desenvolvido por:                                                  ");
		System.out.println("Generation Brasil - eneration@generation.org                               ");
		System.out.println("github.com/conteudoGeneration                                              ");
		System.out.println("***************************************************************************");

<<<<<<< HEAD

	}
	
	
	
=======
	}

>>>>>>> d87a55f (Primeiro commit)
}