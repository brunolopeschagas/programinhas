package br.com.programinhas.sobrecarga;

public class Produto {

    private String nome;
    private double preco;
    private double precoCusto;

    public Produto(){}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, double precoCusto) {
        this.nome = nome;
        this.preco = preco;
        this.precoCusto = precoCusto;
    }

    public double calcularTotal(int quantidade) {
        return this.preco * quantidade;
    }

    public double calcularTotal(int quantidade, double imposto) {
        return (this.preco * quantidade) + imposto;
    }

    public double calcularTotal(double imposto, int quantidade) {
        return (this.preco * quantidade) + imposto;
    }

    public double calcularTotal(int quantidade, double imposto, double desconto) {
        return (this.preco * quantidade) + imposto - desconto;
    }
}
