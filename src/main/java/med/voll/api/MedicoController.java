package med.voll.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

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
        public void listar() {

        }
        
    @PutMapping
        public void atualizar() {

        } 

    @DeleteMapping
        public void deletar() {

        }
}