package br.com.programinhas;

public class Main {
    public static void main(String[] args){
        Produto p1 = new Produto();
        p1.setNome("Pinga");
        p1.setPreco(1);
        p1.setQuantidade(3);
        
        Produto p2 = new Produto();
        p2.setNome("Geleia de mocotó");
        p2.setPreco(10);
        p2.setQuantidade(10);
        
        System.out.println("quantidade p1 " + p1.getQuantidade());
        System.out.println("quantidade p2 " + p2.getQuantidade());
        
        
        
        System.out.println("total 1 = " + p1.calcularTotal());
        System.out.println("total 2 = " + p2.calcularTotal());

    }
}
