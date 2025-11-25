package br.com.senai.infob.ocorrencialab.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.ocorrencialab.models.Ocorrencias;
import br.com.senai.infob.ocorrencialab.models.Turma;
import br.com.senai.infob.ocorrencialab.repositories.OcorrenciasRepository;
import br.com.senai.infob.ocorrencialab.repositories.ProfessorRepository;
import br.com.senai.infob.ocorrencialab.repositories.TurmaRepository;

@Service
public class TurmaService {
@Autowired 
public TurmaRepository turmaRepository;

public List<Turma> listartodos(){
       return turmaRepository.findAll();
        }

        public Turma salvar(Turma turma){
        return turmaRepository.save(turma);
    }

    public boolean  delete(Integer id) {
       Turma turma = turmaRepository.findById(id).get();
        if(turma != null) {
        turmaRepository.deleteById(id);
        return true;
    }
    return false;
    }
    public Turma getId(Integer id){
        return turmaRepository.findById(id).get(); 
    }

    public Turma atualizarTurma(Turma turma, Integer id){
        Turma e = getId(id);
         if (e != null){turma.setId(id);
            turmaRepository.save(turma);
         }
    
         return null;
    }

    


}
