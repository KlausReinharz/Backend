
package com.backend.demo.controlador;



import com.backend.demo.modelo.persona;
import com.backend.demo.repositorio.personaRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/persona")
@AllArgsConstructor

public class PersonaControlador {
    private final personaRepositorio PersonaRepositorio;
    @GetMapping
    public List<persona>listPersona(){return PersonaRepositorio.findAll();
    }

}
