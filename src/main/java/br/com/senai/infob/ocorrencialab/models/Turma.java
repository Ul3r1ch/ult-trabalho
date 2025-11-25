package br.com.senai.infob.ocorrencialab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome_turma")
    private String nome_turma;
  

    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;

    public Turma() {
    }

    public Turma(Integer id, String nome_turma, Professor professor) {
        this.id = id;
        this.nome_turma = nome_turma;
        this.professor = professor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

   

   

    
}
