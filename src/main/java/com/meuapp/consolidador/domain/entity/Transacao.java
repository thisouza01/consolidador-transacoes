package com.meuapp.consolidador.domain.entity;

import com.meuapp.consolidador.domain.enuns.StatusTransacao;
import com.meuapp.consolidador.domain.enuns.TipoTransacao;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/* Utilizando JPA, para transformar uma classe en uma tabela no db */
@Entity
@Table(name = "tb_transacao")
public class Transacao {

    /* criação das colunas no db */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;

    @Column(name = "data_transacao")
    private LocalDate dataTransacao;

    @Column(name = "valor", precision = 15, scale = 2)
    private BigDecimal valor;

    @Column(name = "tipo_transacao")
    private TipoTransacao tipoTransacao;

    @Column(name = "estabelecimento")
    private String estabelecimento;

    @Column(name = "status")
    private StatusTransacao statusTransacao;

    @Column(name = "motivo_rejeicao")
    private String motivoRejeicao;

    @Column(name = "hash_duplicada")
    private String hashDuplicada;

    @Column(name = "data_processamento")
    private LocalDateTime dataProcessamento;

    @Column(name = "id_execucao_job")
    private Long idExecucaoJob;

    public Long getIdExecucaoJob() {
        return idExecucaoJob;
    }

    public void setIdExecucaoJob(Long idExecucaoJob) {
        this.idExecucaoJob = idExecucaoJob;
    }

    public LocalDateTime getDataProcessamento() {
        return dataProcessamento;
    }

    public void setDataProcessamento(LocalDateTime dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }

    public String getHashDuplicada() {
        return hashDuplicada;
    }

    public void setHashDuplicada(String hashDuplicada) {
        this.hashDuplicada = hashDuplicada;
    }

    public String getMotivoRejeicao() {
        return motivoRejeicao;
    }

    public void setMotivoRejeicao(String motivoRejeicao) {
        this.motivoRejeicao = motivoRejeicao;
    }

    public StatusTransacao getStatusTransacao() {
        return statusTransacao;
    }

    public void setStatusTransacao(StatusTransacao statusTransacao) {
        this.statusTransacao = statusTransacao;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /* para debug */
    @Override
    public String toString() {
        return "Transacao{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", dataTransacao=" + dataTransacao +
                ", valor=" + valor +
                ", tipoTransacao=" + tipoTransacao +
                ", estabelecimento='" + estabelecimento + '\'' +
                ", statusTransacao=" + statusTransacao +
                ", motivoRejeicao='" + motivoRejeicao + '\'' +
                ", hashDuplicada='" + hashDuplicada + '\'' +
                ", dataProcessamento=" + dataProcessamento +
                ", idExecucaoJob=" + idExecucaoJob +
                '}';
    }
}
