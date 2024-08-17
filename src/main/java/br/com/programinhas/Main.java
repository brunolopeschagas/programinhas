package br.com.programinhas;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua padre guilhermino", "Centro", 12);
        Pessoa joao = new Pessoa(1, "João da silva", 34, endereco);
        Pessoa maria = new Pessoa(2, "Maria da silva", 33, endereco);

        System.out.println("Casados");
        System.out.println(joao);
        System.out.println(maria);
        
        Endereco enderecoSeparados = new Endereco("Rua padre guilhermino", "centro", 23);
        maria.setEndereco(enderecoSeparados);
        System.out.println("Separados");
        System.out.println(joao);
        System.out.println(maria);

    }
}
