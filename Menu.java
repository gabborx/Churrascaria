package churrascaria;

import java.util.Scanner;

public class Menu {
static Scanner leitor=new Scanner(System.in);
Comandas comanda;


	
	static void mostrarCardapio() {
		System.out.println("====CHURRASCARIA UEPB====");
		System.out.println("");
		System.out.println("1-CARNES				");
		System.out.println("2-BEBIDAS				");
		System.out.println("3-VER COMANDA			");
		System.out.println("0-FINALIZAR PEDIDO		");
		System.out.println("Digite a opcao desejada: ");


	}
	
	
	static void mostrarCarnes() {
		System.out.println("\n====CARNES====		");
		System.out.println("");
		System.out.println("1-Picanha			R$45,00");
		System.out.println("2-Bisteca Suina			R$32,00");
		System.out.println("3-Frango			R$32,00");
		System.out.println("4-Linguica Suina		R$32,00");
		System.out.println("0-Sair							");
		System.out.println("Digite a opcao desejada: ");


	}
	
	
	
	static void mostrarBebidas() {
		System.out.println("\n====Bebidas====		");
		System.out.println("1-Cerveja				R$12,00");
		System.out.println("2-Agua					R$2,00");
		System.out.println("3-Suco 1L				R$15,00");
		System.out.println("4-Refrigerante 1L		R$15,00");
		System.out.println("0-Sair							");
		System.out.println("Digite a opcao desejada: ");

	}
	
	void menu() {
		System.out.println("\nDigite o numero da mesa: ");
		int mesa=leitor.nextInt();
		System.out.println("Digite o numero da comanda: ");
		int numero=leitor.nextInt();
		comanda=new Comandas(mesa,numero);
		int opcao=0;

		do {
			
			

			mostrarCardapio();
			opcao=leitor.nextInt();
			int opcao2;
			int porcao;
			switch(opcao) {
			
			
			case 1:
				mostrarCarnes();
				 opcao2=leitor.nextInt();
				 if(opcao2!=0) {
				System.out.println("Digite a quantidade de porcao: ");
				 porcao=leitor.nextInt();
				
				switch(opcao2) {
				case 1:
					comanda.adicionarProduto("picanha", porcao);
					break;
				case 2:
					comanda.adicionarProduto("bisteca", porcao);
					break;
				case 3:
					comanda.adicionarProduto("frango", porcao);
					break;
				case 4:
					comanda.adicionarProduto("linguica", porcao);
					break;
				case 0:
					System.out.println("Saindo!");
					break;
				default:
					System.out.println("Numero incorreto!");}}
				break;
				
				
				
			case 2:
				mostrarBebidas();
				opcao2=leitor.nextInt();
				System.out.println("Digite a quantidade de bebidas: ");
				 porcao=leitor.nextInt();
					
				 switch(opcao2) {
					case 1:
						comanda.adicionarProduto("cerveja", porcao);
						break;
					case 2:
						comanda.adicionarProduto("agua", porcao);
						break;
					case 3:
						comanda.adicionarProduto("suco", porcao);
						break;
					case 4:
						comanda.adicionarProduto("refrigerante", porcao);
						break;
					case 0:
						System.out.println("Saindo!");
						break;
					default:
						System.out.println("Numero incorreto!");
						break;}
						break;
				 
				 
			case 3:
				comanda.mostrarComanda();
				break;
				
				
			case 4:
				System.out.println("Saindo");
				break;
				
				
			default:
				System.out.println("Numero incorreto!");
				break;
				
				
			}
		}while(opcao!=0);
		
	}
	
}
