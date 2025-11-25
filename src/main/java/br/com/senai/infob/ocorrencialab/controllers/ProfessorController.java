package br.com.senai.infob.ocorrencialab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.ocorrencialab.services.ProfessorService;
import br.com.senai.infob.ocorrencialab.models.Professor;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    public ProfessorService professorService;
     @GetMapping("/count")
    public Long count() {
        return professorService.count();
    }
    @DeleteMapping("/delete/{id}") 
    public String deletar(@PathVariable Integer id) {
        boolean deletou =  professorService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
        }

         @GetMapping("/listar")
        public List<Professor> listarTodos() {
            return professorService.listartodos();
        }
        
    @PostMapping("/salvar")
    public Professor salvar (@RequestBody Professor professor, @RequestParam String senha) {    
        return professorService.save( Professor, professor);
    }


    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha){
    return professorService.login(email, senha);
    }
    @PutMapping("/atualizar/{id}")
        public Professor atualizarProfessor(@PathVariable Integer id, @RequestBody Professor professor ) {
            return professorService.atualizarProfessor(professor, id);
    }
}
