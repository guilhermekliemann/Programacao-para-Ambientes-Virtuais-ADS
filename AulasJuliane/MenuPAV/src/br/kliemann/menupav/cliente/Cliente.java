package br.kliemann.menupav.cliente;

import java.util.Date;

public class Cliente {
    
    private String nome;
    private String cpf;
    private Date dtNascimento;
    private Integer idade;

    public Cliente(String nome, String cpf, Date dtNascimento, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
