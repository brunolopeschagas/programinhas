package br.com.programinhas;

public class Main {
    public static void main(String[] args) {
       
        //duas pessoas com nomes iguais
        Nome nome = new Nome("João", "de Santo Cristo");
        Pessoa pessoa1 = new Pessoa(nome, 25, "MG");
        Pessoa pessoa2 = new Pessoa(nome, 35, "CE");

        System.out.println();
        System.out.println(pessoa1);
        System.out.println();
        System.out.println(pessoa2);

        nome = new Nome("João", "de Santo Cristo Sagrado");
        pessoa2.setNome(nome);
        
        System.out.println();
        System.out.println(pessoa1);
        System.out.println();
        System.out.println(pessoa2);

     
    }
}
