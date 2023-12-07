
package com.backend.demo.repositorio;

import com.backend.demo.modelo.persona;
import com.backend.demo.modelo.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface personaRepositorio extends JpaRepository<persona,Integer>{
}
