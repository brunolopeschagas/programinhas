package br.com.programinhas;

public class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco){
        this(nome,preco,1000);
        System.out.println("jesus");
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

}
