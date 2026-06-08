package churrascaria;

public class Produto {
	String nomeProduto;
	double preco;
	double porcao;
	
	
	Produto(String nomeProduto,int porcao, double preco){
		this.nomeProduto=nomeProduto;
		this.porcao=porcao;
		this.preco=preco;
	}
	
	
	@Override
	 public String toString() {
		 return nomeProduto + " | " + porcao + "g | R$ " + preco;
	    }
	
	
}