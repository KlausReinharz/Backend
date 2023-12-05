
package com.backend.demo.servicio;

import com.backend.demo.modelo.persona;
import java.util.List;

public interface IPersonaServicio  {
    public List<persona> listarPersona();
    public persona buscarPersonaId(Integer idPersona);
    public void guardarpersona(persona persona);
    
   
    
}
