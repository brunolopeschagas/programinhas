package br.com.programinhas.comparando_objetos;

public class PaoComSalame {
    private String nacionalidade;
    private float calorias;

    public PaoComSalame(String nacionalidade, float calorias) {
        this.nacionalidade = nacionalidade;
        this.calorias = calorias;
    }

    @Override
    public boolean equals(Object objetoASerTestado) {
        PaoComSalame pcsASerTestado = (PaoComSalame) objetoASerTestado;

        if (pcsASerTestado.nacionalidade.equals(this.nacionalidade)
                && pcsASerTestado.calorias == this.calorias) {
            return true;
        }

        return false;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public float getCalorias() {
        return calorias;
    }

}
