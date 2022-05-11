package programacaoparaambientesvisuais.classes;

public class Aluno {
    
    public Aluno() {}
    
    private int ra;
    private String nome;
    private String dtNasc;
    private String cpf;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nnome: " + nome + ", ra: " + ra + ", dtNasc: " + dtNasc + ", cpf: " + cpf + "\n";
    }
    
}
