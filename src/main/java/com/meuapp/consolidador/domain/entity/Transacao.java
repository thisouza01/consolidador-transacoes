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

}
