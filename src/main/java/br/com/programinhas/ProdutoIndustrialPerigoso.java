package br.com.programinhas;

public class ProdutoIndustrialPerigoso extends Produto{

    private final double TAXA_PERICULOSIDADE = 10;
    
    public ProdutoIndustrialPerigoso(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public double calcularTotal(){
        double totalProduto = this.preco * this.quantidade;
        double totalComTaxa = totalProduto + TAXA_PERICULOSIDADE;
        return totalComTaxa;
    }
    
}
