package br.com.programinhas;

public class Nome {
    private String nome;
    private String sobrenome;

    public Nome(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Nome [nome=" + nome + ", sobrenome=" + sobrenome + "]";
    }
    
}
