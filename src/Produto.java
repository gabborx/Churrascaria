package churrascaria;

public class Produto {
	String nomeProduto;
	double preco;
	int quantidade;
	
	
	Produto(String nomeProduto,int quantidade, double preco){
		this.nomeProduto=nomeProduto;
		this.quantidade=quantidade;
		this.preco=preco;
	}
	
	
	@Override
	 public String toString() {
		 return nomeProduto + " | " + quantidade + "X | R$ " + preco;
	    }
	
	
}
