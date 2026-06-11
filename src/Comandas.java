package churrascaria;

public class Comandas {
    int numeroComanda;
    int mesa;
    Produto produto[];
    int quantidadeProduto;

    Comandas(int mesa, int numero) {
        this.mesa = mesa;
        this.numeroComanda = numero;
        quantidadeProduto = 0;
        produto = new Produto[0];
    }

    void adicionarProduto(String nome, int quantidade) {
        if (nome.equalsIgnoreCase("picanha")      ||
            nome.equalsIgnoreCase("bisteca")      ||
            nome.equalsIgnoreCase("frango")       ||
            nome.equalsIgnoreCase("linguica")     ||
            nome.equalsIgnoreCase("cerveja")      ||
            nome.equalsIgnoreCase("agua")         ||
            nome.equalsIgnoreCase("suco")         ||
            nome.equalsIgnoreCase("refrigerante")) {

            Produto novoProduto[] = new Produto[quantidadeProduto + 1];
            for (int i = 0; i < quantidadeProduto; i++) {
                novoProduto[i] = this.produto[i];
            }
            quantidadeProduto++;
            novoProduto[quantidadeProduto - 1] = new Produto(nome, quantidade, calcularPreco(nome));
            this.produto = novoProduto; 
            System.out.println("Produto adicionado com sucesso!");
        } else {
            System.out.println("O produto nao tem no cardapio!");
        }
    }

    double calcularPreco(String nome) {
    	if (nome.equalsIgnoreCase("picanha"))  {   
        	return 45.00;}
         if (nome.equalsIgnoreCase("bisteca")) {      
        	return 32.00;}
         if (nome.equalsIgnoreCase("frango"))  { 
        	return 22.00;}
         if (nome.equalsIgnoreCase("linguica"))   {  
        	return 18.00;}
         if (nome.equalsIgnoreCase("cerveja"))      {
        	return 12.00;}
         if (nome.equalsIgnoreCase("agua")) {        
        	return  2.00;}
         if (nome.equalsIgnoreCase("suco"))   {      
        	return 15.00;}
         if (nome.equalsIgnoreCase("refrigerante")) { 
        	return 15.00;}
        return 0;
    }

    double calcularTotal() {
        double total = 0;
        for (int i = 0; i < quantidadeProduto; i++) {
            total += produto[i].preco*produto[i].quantidade;
        }
        return total;
    }

    void mostrarComanda() {
        System.out.println("Comanda: " + numeroComanda + " | Mesa: " + mesa);
        System.out.println("=============================");
        for (int i = 0; i < quantidadeProduto; i++) {
            System.out.println(produto[i]);
        }
        System.out.println("TOTAL: R$ " + calcularTotal());
        System.out.println("=============================");
    }
}
