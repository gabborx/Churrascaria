package churrascaria;

public class Comandas {
int numeroComanda;
int mesa;

Produto produto[];
int quantidade;


Comandas(int mesa,int numero){
	this.mesa=mesa;
	this.numeroComanda=numero;
	quantidade=0;
	produto=new Produto[quantidade];
}

void adicionarProduto(String produto,int porcao) {
	if(	produto.equalsIgnoreCase("picanha") || 
		produto.equalsIgnoreCase("bisteca") || 
		produto.equalsIgnoreCase("frango") ||
		produto.equalsIgnoreCase("linguica")) {
		Produto novoProduto[]=new Produto[quantidade+1];
		for(int i=0;i<quantidade;i++) {
			novoProduto[i]=this.produto[i];
		}
	quantidade++;
	novoProduto[quantidade-1]=new Produto(produto,porcao,calcularPreco(produto));
	System.out.println("O produto adicionado com sucesso! ");

	}
	else {
		System.out.println("O produto nao tem no cardapio! ");
	}
	
	
	
}

double calcularPreco(String nome) {
    if (nome.equalsIgnoreCase("picanha")) {
    	return 45.00;}
    else if (nome.equalsIgnoreCase("bisteca")) {
    	return 32.00;}
    else if (nome.equalsIgnoreCase("frango"))   {
    	return 22.00;}
    else if (nome.equalsIgnoreCase("linguica")) {
    	return 18.00;}
    else if(nome.equalsIgnoreCase("cerveja")) {
    	return 12.00;
    }
    else if(nome.equalsIgnoreCase("agua")) {
    	return 2.00;
    }
    else if(nome.equalsIgnoreCase("suco")) {
    	return 15.00;
    }
    else if(nome.equalsIgnoreCase("refrigerante")) {
    	return 15.00;
    }
    else {
    return 0;}
}




double calcularTotal() {
    double total = 0;
    for (int i = 0; i < quantidade; i++) {
        total += produto[i].preco;
    }
    return total;}






void mostrarComanda() {
	System.out.println("=============================");
    System.out.println("Comanda: " + numeroComanda + " | Mesa: " + mesa);
    System.out.println("=============================");
	for(int i=0;i<quantidade;i++)	{
		System.out.println(produto[i]);
	}
	
}
}
