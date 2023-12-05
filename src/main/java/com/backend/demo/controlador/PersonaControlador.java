
package com.backend.demo.controlador;

import com.backend.demo.modelo.persona;
import com.backend.demo.servicio.PersonaServicio;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*http://localhost:9090/personas-app*/
@RequestMapping("personas-app")
@CrossOrigin(value="http://localhost:4200")

public class PersonaControlador {
    private static final Logger logger = 
         LoggerFactory.getLogger(PersonaControlador.class);
    
    @Autowired
    private PersonaServicio personaServicio;
    
    @GetMapping("/persona")
    public List<persona>obtenerPersona(){
        List<persona> personas= this.personaServicio.listarPersona();
        logger.info("personas obtenidas");
        return personas; 
    }
}
