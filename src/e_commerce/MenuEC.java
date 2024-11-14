package e_commerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import ec.model.Roupas;  
import features.Cores;
import ec_Controller.EC_Controller;


public class MenuEC {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int opcao, codigo;
		String usuario, produto;
		float preco;
		
		 EC_Controller controller = new EC_Controller();
		
		while(true) {
			
			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("          E-COMMERCE TOPS GALERIS (nome a decidir)   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Listar produtos                      ");
			System.out.println("            2 - Adicionar produtos                   ");
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
				
				System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND +"\nDigite um numero dentro das opções!!\n");
				leia.nextLine();
				opcao=-1;
			}
			
			if (opcao == 0) {
				
				System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND + "\nObrigado por comprar com a gente!");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				
				System.out.println(Cores.TEXT_WHITE + "Listando todos os produtos...\n");
                controller.listarProdutos();
                
                keypress();
                break;
				
			case 2:
				
				 try {
				        System.out.println("Digite o código do produto:");
				        codigo = leia.nextInt();
				        leia.nextLine();  
				        
				        System.out.println("Digite o nome do produto:");
				        produto = leia.nextLine();
				        
				        System.out.println("Digite o preço do produto:");
				        preco = leia.nextFloat();
				        leia.nextLine();
				        
				        System.out.println("Digite o tamanho do produto (ex: S, M, L):");
				        char tamanho = leia.nextLine().charAt(0);
				        
				        System.out.println("Digite a cor do produto:");
				        String cor = leia.nextLine();
				        
				        System.out.println("Digite o material do produto:");
				        String material = leia.nextLine();

				       
				        Roupas novoProduto = new Roupas(codigo, produto, preco, tamanho, cor, material);
				        controller.Adicionar(novoProduto);
				        
				    } catch (InputMismatchException e) {
				        System.out.println("Erro: Digite os valores corretamente!");
				        leia.nextLine();  
				    }
				 keypress();
				 break;
                
			case 3:
				 try {
                     System.out.println("Digite o código do produto a ser atualizado:");
                     codigo = leia.nextInt();
                     leia.nextLine();  
                     System.out.println("Digite o novo nome do produto:");
                     produto = leia.nextLine();
                     System.out.println("Digite o novo preço do produto:");
                     preco = leia.nextFloat();
                     leia.nextLine();  

                     controller.Editar(codigo, produto, preco);
                     
                 } catch (InputMismatchException e) {
                     System.out.println("Erro: Digite os valores corretamente!");
                     leia.nextLine(); 
                 }
				 keypress();
                 break;
                 
			case 4:
				try {
                    System.out.println("Digite o código do produto a ser excluído:");
                    codigo = leia.nextInt();
                    leia.nextLine();  
                    controller.Excluir(codigo);
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Digite o código corretamente!");
                    leia.nextLine(); 
                }
				keypress();
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;

			case 0:
				System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND + "\nObrigado por comprar com a gente!");
			    leia.close(); 
			    System.exit(0);
				break;	
		}  
	 }
  }	
	
	public static void keypress() {
	    Scanner leia = new Scanner(System.in);
	    System.out.println("\nPressione Enter para continuar...");
	    leia.nextLine();
	}  
}

