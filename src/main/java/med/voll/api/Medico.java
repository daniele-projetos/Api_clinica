package med.voll.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="medico")
@Entity(name = "medico")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")




public class Medico {
@Id @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
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
