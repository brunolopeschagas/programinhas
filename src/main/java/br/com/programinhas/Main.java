package br.com.programinhas;

import br.com.programinhas.interfaces.Pix;

public class Main {
    public static void main (String[] args){
       Pix pixParaJoao = new Pix("123.456.789.-12", 0.0001);
       if(pixParaJoao.validar()){
           pixParaJoao.pagar();
       }
    }
}
