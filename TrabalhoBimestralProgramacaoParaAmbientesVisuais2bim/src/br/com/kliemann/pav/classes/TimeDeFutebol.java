package br.com.kliemann.pav.classes;

public class TimeDeFutebol {
    
    public TimeDeFutebol() {
    }
    
    private String nome;
    private int numVitorias;
    private int numDerrotas;
    private int numEmpates;
    private Integer totalPontos = 0;

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

    public Integer getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPontos(Integer totalPontos) {
        this.totalPontos = totalPontos;
    }

    @Override
    public String toString() {
        return "\nNome do Time: " + nome + " | Vitorias: " + numVitorias + " | Derrotas: " + numDerrotas + " | Empates: " + numEmpates + " | Pontuação Total: " + totalPontos + "\n";
    }
    
}
