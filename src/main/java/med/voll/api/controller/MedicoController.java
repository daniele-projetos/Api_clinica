package med.voll.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import med.voll.api.domain.medico.DadosCadastroMedico;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.MedicoRepository;

@RestController
@RequestMapping ("/medico")


public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
        public String cadastrar(@RequestBody DadosCadastroMedico dados) {
            var medico = repository.save(new Medico(null,dados.nome(), dados.email(), dados.telefone(), dados.crm()));
            System.out.println(medico);
            return "Médico cadastrado"+medico;
        }
    
    @GetMapping
        public List<Medico>listar() {
            List<Medico> medicos = repository.findAll();
               return medicos;  


        }
        
    @PutMapping
        public void atualizar(@RequestBody DadosAtualizacaoMedico dados) {
            var medico = repository.getReferenceById(dados.id());
                medico.atualizarMedico(dados);

        } 

    @DeleteMapping
        public void deletar() {

        }
}