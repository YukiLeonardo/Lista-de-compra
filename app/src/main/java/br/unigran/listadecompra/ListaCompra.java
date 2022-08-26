package br.unigran.listadecompra;

public class ListaCompra {
    String nome;
    String marca;
    String quant;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }
    @Override
    public String toString() {
        return nome + " / " + marca + " / " + quant ;
    }
}
