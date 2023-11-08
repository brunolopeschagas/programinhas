package br.com.programinhas;

public class FatorialRecursivo {

    public long calcularFatorial(long numero){
        if(numero >= 1){
            System.out.print(numero + " * ");
            long resultado = numero * calcularFatorial(numero - 1);
            return resultado;
        }
        return 1;
    }

}
