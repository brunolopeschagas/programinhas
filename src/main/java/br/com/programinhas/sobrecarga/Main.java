package br.com.programinhas.sobrecarga;

public class Main {
    public static void main(String[] args) {
       Produto produto = new Produto("Pinga", 1, .50);
       double total = produto.calcularTotal(
         3,
         2.50,
          1
        );
       System.out.println("TOTAL: " + total);
    }
}
