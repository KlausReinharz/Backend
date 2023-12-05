
package com.backend.demo.repositorio;

import com.backend.demo.modelo.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepositorio extends JpaRepository <usuario,Integer>{
    
   //metodos para poder comunicarnos hacia la base de datos, actualizar, eliminar
}
