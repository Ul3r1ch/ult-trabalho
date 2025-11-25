package br.com.senai.infob.ocorrencialab.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.senai.infob.ocorrencialab.models.Professor;
import br.com.senai.infob.ocorrencialab.repositories.ProfessorRepository;

@Service
public class ProfessorService {
    @Autowired
    public ProfessorRepository professorRepository;
    
    public String login(String email, String senha) {
   Professor professor = professorRepository.findByEmail(email);
    if(professor != null && senha.equals(professor.getSenha())){
        return "login efetuado com sucesso";
    }
    return "falha ao encontrar o login";
    }

    public Professor salvar (Professor professor, String senha){
    if (professor.getSenha().equals(senha)){
        return professorRepository.save(professor);

    }
    return null;
    }
     public List<Professor> listartodos(){
       return professorRepository.findAll();
        }

        public Professor salvar(Professor professor){
        return professorRepository.save(professor);
    }

    public boolean  delete(Integer id) {
       Professor professor = professorRepository.findById(id).get();
        if(professor != null) {
        professorRepository.deleteById(id);
        return true;
    }
    return false;
    }
    public Professor getId(Integer id){
        return professorRepository.findById(id).get(); 
    }

    public Professor atualizarProfessor(Professor professor, Integer id){
        Professor e = getId(id);
         if (e != null){professor.setId(id);
           professorRepository.save(professor);
         }
    
         return null;
    }
     

}
