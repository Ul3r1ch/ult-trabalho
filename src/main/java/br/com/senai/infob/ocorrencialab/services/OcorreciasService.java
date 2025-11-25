package br.com.senai.infob.ocorrencialab.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.ocorrencialab.models.Ocorrencias;
import br.com.senai.infob.ocorrencialab.repositories.OcorrenciasRepository;

@Service
public class OcorreciasService {
   @Autowired public OcorrenciasRepository ocorrenciasRepository;
     
     public List<Ocorrencias> listartodos(){
       return ocorrenciasRepository.findAll();
        }

        public Ocorrencias salvar(Ocorrencias ocorrencias){
        return ocorrenciasRepository.save(ocorrencias);
    }

    public boolean  delete(Integer id) {
       Ocorrencias ocorrencias = ocorrenciasRepository.findById(id).get();
        if(ocorrencias != null) {
        ocorrenciasRepository.deleteById(id);
        return true;
    }
    return false;
    }
    public Ocorrencias getId(Integer id){
        return ocorrenciasRepository.findById(id).get(); 
    }

    public Ocorrencias atualizarOcorrencias(Ocorrencias ocorrencias, Integer id){
        Ocorrencias e = getId(id);
         if (e != null){ocorrencias.setId(id);
            ocorrenciasRepository.save(ocorrencias);
         }
    
         return null;
    }


}
