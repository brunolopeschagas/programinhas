package br.com.programinhas;

public class Main {
    public static void main(String[] args){
        long numeroFatorial = 6;
        FatorialRecursivo fatorialRecursivo = new FatorialRecursivo();
        System.out.println(fatorialRecursivo.calcularFatorial(numeroFatorial));
    }
}
