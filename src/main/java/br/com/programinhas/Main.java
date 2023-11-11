package br.com.programinhas;

public class Main {
    public static void main(String[] args){

        int elementos = 1_000_000_000;

        //tempo inicial
        long tempoInicial = System.currentTimeMillis();
        
        //operacoes
        System.out.println("ARRAY");
        System.out.println("INICIO COM " + elementos + " ELEMENTOS EM " + tempoInicial);

        P2Array P2 = new P2Array(elementos);

        //tempo final
        long tempoFinal = System.currentTimeMillis();
        System.out.println("FIM COM " + elementos + " ELEMENTOS EM " + tempoFinal);
        System.out.println("TEMPO TOTAL = " + (tempoFinal - tempoInicial));
    }
}
