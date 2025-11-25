package br.com.senai.infob.ocorrencialab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.senai.infob.ocorrencialab.models.Professor;



@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{
     
    @Query(value="select * from professor where email = :email;", nativeQuery=true)
    public Professor findByEmail(String email);
}
