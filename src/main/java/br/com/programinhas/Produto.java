package br.com.programinhas;

public class Produto {
    
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularTotal(){
        return this.preco * this.quantidade;
    }

    
}
