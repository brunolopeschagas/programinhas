package br.com.programinhas.interfaces;

public class Pix implements MeioDePagamento{

    private String chave;
    private double valor;

    public Pix(String chave, double valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public boolean validar() {
        if(this.chave.isBlank()){
            System.out.println("Chave pix não pode ser vazia");
            return false;
        }
        if(this.valor < 0.01){
            System.out.println("Valor do pix não pode ser inferior a 1 centavo");
            return false;
        }
        return true;
    }

    @Override
    public boolean pagar() {
        System.out.println("Valor " + valor + " foi pago com sucesso");
        return true;
    }

    public String getChave() {
        return chave;
    }

    public double getValor() {
        return valor;
    }
    
}
