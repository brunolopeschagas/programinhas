package br.com.programinhas;

import java.util.ArrayList;
import java.util.List;

public class P1ArrayList {
    
    public List<Integer> elementos = new ArrayList<>();

    public P1ArrayList(int quantosElementos){
        for(int i = 0; i < quantosElementos; i++){
            elementos.add(i);
        }
    }

}
