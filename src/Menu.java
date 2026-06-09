package churrascaria;

import java.util.Scanner;

public class Menu {
static Scanner leitor=new Scanner(System.in);
Comandas comandas[];
int totalComandas;






	Menu() {
		comandas = new Comandas[0];
		totalComandas = 0;
	}






	
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
		System.out.println("1-Cerveja			R$12,00");
		System.out.println("2-Agua				R$2,00");
		System.out.println("3-Suco 1L			R$15,00");
		System.out.println("4-Refrigerante 1L		R$15,00");
		System.out.println("0-Sair							");
		System.out.println("Digite a opcao desejada: ");

	}
	  

	 void adicionarComanda(Comandas c) {
		Comandas novo[] = new Comandas[totalComandas + 1];
		for (int i = 0; i < totalComandas; i++) {
       novo[i] = comandas[i];
		}
		novo[totalComandas] = c;
		totalComandas++;
		comandas = novo;}

	 
	void verTodasComandas() {
	        if (totalComandas == 0) {
	            System.out.println("Nenhuma comanda registrada!");
	            return;
	        }
	        System.out.println("\n====TODAS AS COMANDAS====");
	        for (int i = 0; i < totalComandas; i++) {
	            comandas[i].mostrarComanda();  } }
	
	
	
void novaComanda() {
System.out.println("Digite o numero da mesa: ");
int mesa = leitor.nextInt();

System.out.println("Digite o numero da comanda: ");
int numero = leitor.nextInt();

Comandas comanda = new Comandas(mesa, numero);
int opcao;	       
	        
do {
mostrarCardapio();
opcao = leitor.nextInt();
int opcao2;
int porcao;

switch (opcao) {
	case 1:           
		mostrarCarnes();
	    opcao2 = leitor.nextInt();
	    if (opcao2 != 0) {
	    	System.out.println("Digite quantidade de porcoes: ");
	        porcao = leitor.nextInt();
	        switch (opcao2) {
	        case 1:
	        	comanda.adicionarProduto("picanha",porcao); 
	            break;
	        case 2:
	            comanda.adicionarProduto("bisteca",porcao); 
	            break;
	        case 3: 
	            comanda.adicionarProduto("frango",porcao); 
	            break;
	        case 4: 
	            comanda.adicionarProduto("linguica",porcao); 
	            break;
	        default: 
	            System.out.println("Numero incorreto!"); 
	            break;
	                        }
	                    }
	     break;
	
	case 2:
		mostrarBebidas();
		opcao2 = leitor.nextInt();
		        
		if (opcao2 != 0) {
			System.out.println("Digite a quantidade: ");
		    porcao = leitor.nextInt();
		    switch (opcao2) {
		    case 1: 
		    	comanda.adicionarProduto("cerveja",porcao); 
		        break;
		    case 2: 
		        comanda.adicionarProduto("agua",porcao); 
		        break;
		    case 3: 
		        comanda.adicionarProduto("suco",porcao); 
		        break;
		    case 4: 
		        comanda.adicionarProduto("refrigerante",porcao); 
		        break;
		    default: 
		        System.out.println("Numero incorreto!"); 
		        break;
		                        }
		                  }
		break;

	case 3:    
		comanda.mostrarComanda();      
		break;
	   
	case 0:
	    comanda.mostrarComanda(); 
	    adicionarComanda(comanda);
	    System.out.println("Comanda finalizada!");
	    break;
	             
	             
	default:
		System.out.println("Numero incorreto!");
}     } 

while (opcao != 0);
	    }

	
void menu() {
 int opcao;

 do {
       System.out.println("\n====CHURRASCARIA UEPB====");
       System.out.println("1-Nova comanda");
       System.out.println("2-Ver todas as comandas");
       System.out.println("0-Sair");
       System.out.println("Digite a opcao desejada: ");
       opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    novaComanda();
                    break;
                case 2:
                    verTodasComandas();
                    break;
                case 0:
                    System.out.println("Encerrando sistema!");
                    break;
                default:
                    System.out.println("Numero incorreto!");
            }
        } while (opcao != 0);
    }

   
}