package br.com.senai.infob.ocorrencialab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.ocorrencialab.services.OcorrenciasService;

import br.com.senai.infob.ocorrencialab.models.Ocorrencias;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciasController {
    
    @Autowired
    private OcorrenciasService ocorrenciasService;

     @GetMapping("/count")
    public Long count() {
        return ocorrenciasService.count();
    }
    @DeleteMapping("/delete/{id}") 
    public String deletar(@PathVariable Integer id) {
        boolean deletou =  OcorrenciasService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
        }

         @GetMapping("/listar")
        public List<Ocorrencias> listarTodos() {
            return OcorrenciasService.listartodos();
        }
        
    @PostMapping("/salvar")
    public Ocorrencias salvar (@RequestBody Ocorrencias ocorrencias, @RequestParam String senha) {    
        return OcorrenciasService.save( Ocorrenciasas, ocorrencias);
    }


    @PutMapping("/atualizar/{id}")
        public Ocorrencias atualizaroOcorrencias(@PathVariable Integer id, @RequestBody Ocorrencias ocorrencias ) {
            return OcorrenciasService.atualizarOcorrencias(ocorrencias, id);
    }
}
