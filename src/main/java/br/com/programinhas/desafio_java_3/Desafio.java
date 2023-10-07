package br.com.programinhas.desafio_java_3;

public class Desafio {
    
    public static void main(String[] args){
        
        System.out.println("\nDESAFIO JAVA #3\n");

        int chuletas = 3;

        switch(chuletas){
            case 1:
                System.out.println("\nFraco, minha vó come mais que isso");
                break;
            case 2:
                System.out.println("\nMelhorou, contudo tenho um primo que come mais");
                break;
            case 3:
                System.out.println("\nAgora sim, senti o instinto animal!");

            default:
                System.out.println("\nNão consegui te entender, pode repetir?");
        }
    }
}
