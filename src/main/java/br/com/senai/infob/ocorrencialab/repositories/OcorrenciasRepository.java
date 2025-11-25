package br.com.senai.infob.ocorrencialab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.infob.ocorrencialab.models.Ocorrencias;

@Repository
public interface OcorrenciasRepository extends JpaRepository<Ocorrencias, Integer>{

}
