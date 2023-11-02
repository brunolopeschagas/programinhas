package br.com.programinhas;

public class Main {
    public static void main(String[] args) {
      Produto produto = new Produto("Pinga", 1.5, 10);
      System.out.println("Total = " + produto.calcularTotal());

      produto = new ProdutoIndustrialPerigoso("Corote de framboesa", 1.5, 10);
      System.out.println("Total perigoso = " + produto.calcularTotal());
    }
}
