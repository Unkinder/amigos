package org.localiza.amigos.amigos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorHola {
    //Aqui adentro van los metodos!!! GET POST, ETC.
    //Antes uno muy facil para que sea su hola mundo de Arquitectura con servicios REST
    @GetMapping("/hola")
    public String holaMundo(){
        
        return "MI PRIMER SERVICIO REST DE JAVA PARA EL MUNDO!!!";
    }

}
