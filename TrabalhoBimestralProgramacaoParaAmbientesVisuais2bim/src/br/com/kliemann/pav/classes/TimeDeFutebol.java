package br.com.kliemann.pav.classes;

public class TimeDeFutebol {
    
    public TimeDeFutebol() {
    }
    
    private String nome;
    private int numVitorias = 0;
    private int numDerrotas = 0;
    private int numEmpates = 0;
    private int totalPontos = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumVitorias() {
        return numVitorias;
    }

    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }

    public int getNumDerrotas() {
        return numDerrotas;
    }

    public void setNumDerrotas(int numDerrotas) {
        this.numDerrotas = numDerrotas;
    }

    public int getNumEmpates() {
        return numEmpates;
    }

    public void setNumEmpates(int numEmpates) {
        this.numEmpates = numEmpates;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }

    @Override
    public String toString() {
        return "TimeDeFutebol{" + "nome=" + nome + ", numVitorias=" + numVitorias + ", numDerrotas=" + numDerrotas + ", numEmpates=" + numEmpates + ", totalPontos=" + totalPontos + '}';
    }
    
}
