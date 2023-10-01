package br.com.programinhas.comparando_objetos;

public class ComparandoObjetos {
    public static void main( String[] args )
    {
        PaoComSalame pcs1 = new PaoComSalame("panéd de salamê", 300);
        PaoComSalame pcs2 = new PaoComSalame("pão com salame Brasileiro", 601);
        PaoComSalame pcs3 = new PaoComSalame("pão com salame Brasileiro", 601);

        System.out.println(pcs1.equals(pcs2));
        System.out.println(pcs2.equals(pcs3));
    }
}
