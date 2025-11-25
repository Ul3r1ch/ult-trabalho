package br.com.senai.infob.ocorrencialab.models;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ocorrencias")
public class Ocorrencias {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descrição")
    private String descricao;
    @Column(name = "local_ocorrencia")
    private LocalDateTime local_ocorrencia;
    @Column(name = "data_ocorrencia")
    private LocalDateTime data_ocorrencia;
    @Column (name = "titulo")
    private String titulo;
    
    @ManyToOne
    @JoinColumn(name = "turma_id", nullable = false)
    private Turma turma;

    public Ocorrencias() {
    }

    public Ocorrencias(Integer id, String descricao, LocalDateTime local_ocorrencia, LocalDateTime data_ocorrencia,
            String titulo, Turma turma) {
        this.id = id;
        this.descricao = descricao;
        this.local_ocorrencia = local_ocorrencia;
        this.data_ocorrencia = data_ocorrencia;
        this.titulo = titulo;
        this.turma = turma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getLocal_ocorrencia() {
        return local_ocorrencia;
    }

    public void setLocal_ocorrencia(LocalDateTime local_ocorrencia) {
        this.local_ocorrencia = local_ocorrencia;
    }

    public LocalDateTime getData_ocorrencia() {
        return data_ocorrencia;
    }

    public void setData_ocorrencia(LocalDateTime data_ocorrencia) {
        this.data_ocorrencia = data_ocorrencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    

}