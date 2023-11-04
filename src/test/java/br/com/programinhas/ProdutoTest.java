package br.com.programinhas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutoTest {
    
    @Test
    public void retorna4SePreco2EQuantidade2(){
        Produto produto = new Produto("Pinga", 2, 2);
        double resultaEsperado = 4;
        double resultadoDoCalculo = produto.calcularTotal();
        Assertions.assertEquals(resultaEsperado,resultadoDoCalculo); 
    }

    @Test
    public void retorna10000SePreco50EQuantidade200(){
        Produto produto = new Produto("Pinga", 50, 200);
        double resultaEsperado = 10000;
        double resultadoDoCalculo = produto.calcularTotal();
        Assertions.assertEquals(resultaEsperado, resultadoDoCalculo);
    }

    @Test
    public void retornaExceptionSePrecoOuQuantidadeNegativos(){
        Produto produto = new Produto("Pinga", -1, 20);
        
        Assertions.assertThrows(
            RuntimeException.class,
            () -> produto.calcularTotal()
        );
    }
}
