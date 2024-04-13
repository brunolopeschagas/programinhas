package br.com.programinhas;

public class Main {
    public static void main(String[] args){

        long tempoInicial = System.currentTimeMillis();
        System.out.println();

        String stringNormal = "";
        for(int i = 0; i < 100_000; i++){
            stringNormal += i + ", ";
        }

        System.out.println(stringNormal);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo total: " + (tempoFinal - tempoInicial));
    }
}
