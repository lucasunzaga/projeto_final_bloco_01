package e_commerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import features.Cores;



public class MenuEC {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int opcao;
		String usuario, produto;
		float preco;
		
		while(true) {
			
			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("          E-COMMERCE TOPS GALERIS (nome a decidir)   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar produtos                   ");
			System.out.println("            2 - Listar produtos                      ");
			System.out.println("            3 - Atualizar produtos                   ");
			System.out.println("            4 - Excluir produtos                     ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite um numero dentro das opções!!");
				leia.nextLine();
				opcao=0;
			}
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_BLACK_BOLD + "\nObrigado por comprar com a gente!");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
                break;
                
			case 2:
                break;
                
			case 3:
                break;
                
			case 4:
			    break;

			case 0:
				break;	
		}      	
	 }
  }	
}

