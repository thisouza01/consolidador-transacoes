package com.meuapp.consolidador.domain.dto;

public class TransacaoDTO {

     /*
        Objeto que representa uma linha vinda do CSV
     */

    private String cpf;
    private String data;
    private String valor;
    private String tipo;
    private String mercador;

    /*  Constuctor vazio */
    public TransacaoDTO() {
    }

    /* Para o reader mapear */
    public TransacaoDTO(String cpf, String data, String valor, String tipo, String mercador) {
        this.cpf = cpf;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.mercador = mercador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMercador() {
        return mercador;
    }

    public void setMercador(String mercador) {
        this.mercador = mercador;
    }
}
