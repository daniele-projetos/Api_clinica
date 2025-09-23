package med.voll.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Medico {

    private  Long id ;
    private  String nome;
    private  String email;
    private  String telefone;
    private  String crm;
    
  public Medico(DadosCadastroMedico dados ){
this.nome = dados.nome();
this.email= dados.email();
this.telefone =dados.telefone();
this.crm = dados.crm();

}  

}
