package br.com.programinhas;

public class Pessoa {

    private Nome nome;
    private int idade;
    private String estadoOrigem;

    public Pessoa(Nome nome, int idade, String estadoOrigem) {
        this.nome = nome;
        this.idade = idade;
        this.estadoOrigem = estadoOrigem;
    }

    public Nome getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }
    
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", estadoOrigem=" + estadoOrigem + "]";
    }

}
