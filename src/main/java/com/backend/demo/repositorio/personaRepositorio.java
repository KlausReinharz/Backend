
package com.backend.demo.repositorio;

import com.backend.demo.modelo.persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personaRepositorio extends JpaRepository<persona,Integer>{
    
}
