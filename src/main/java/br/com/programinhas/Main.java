package br.com.programinhas;

public class Main {
    public static void main(String[] args){

        long tempoInicial = System.currentTimeMillis();
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 100_000; i++){
            stringBuilder.append(i + ", ");
        }

        System.out.println(stringBuilder.toString());
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo total: " + (tempoFinal - tempoInicial));
    }
}
