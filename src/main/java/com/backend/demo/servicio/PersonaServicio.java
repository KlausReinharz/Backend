
package com.backend.demo.servicio;
import com.backend.demo.modelo.persona;
import com.backend.demo.repositorio.personaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PersonaServicio implements IPersonaServicio {
    @Autowired
    private personaRepositorio PersonaRepositorio;
    
    @Override
    public List<persona> listarPersona() {
       return this.PersonaRepositorio.findAll();
    }

    @Override
    public persona buscarPersonaId(Integer idPersona) {
       persona persona = this.PersonaRepositorio.findById(idPersona).orElse(null);
       return persona;         
    }

    @Override
    public void guardarpersona(persona persona){
        this.PersonaRepositorio.save(persona);
    }
}
