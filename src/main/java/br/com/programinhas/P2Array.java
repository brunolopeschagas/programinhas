package br.com.programinhas;

public class P2Array {
    
    public int[] elementos;

    public P2Array(int quantosElementos){
        elementos = new int[quantosElementos];
        for(int i = 0; i < quantosElementos; i++){
            elementos[i] = i;
        }
    }
}
