package br.com.kliemann.pav.classes;

public class Produto {

    public Produto() {
    }
    
    private String nomeProduto;
    private int qtdComprada;
    private Double vlrUnitario;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public Double getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(Double vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }

    @Override
    public String toString() {
        return "\nProduto{" + "nomeProduto=" + nomeProduto + ", qtdComprada=" + qtdComprada + ", vlrUnitario=" + vlrUnitario + "}\n";
    }

}
