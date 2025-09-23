package med.voll.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //define a classe como um controller de API Rest
@RequestMapping ("/Hello") //Mapeia a url /hello para esta classe




public class HelloController {

@GetMapping          //Mapeia requisições http get para o método
public String olaMundo(){
return "hello world!";
}




}
