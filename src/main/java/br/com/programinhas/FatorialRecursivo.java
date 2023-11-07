package br.com.programinhas;

public class FatorialRecursivo {

    public long calcularFatorial(long numero){
        if(numero >= 1){
            long resultado = numero * this.calcularFatorial(numero - 1);
            return resultado;
        }
        return 1;
    }

}
