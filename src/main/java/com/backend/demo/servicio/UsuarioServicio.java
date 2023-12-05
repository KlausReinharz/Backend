
package com.backend.demo.servicio;
import com.backend.demo.modelo.usuario;
import com.backend.demo.repositorio.usuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 

public class UsuarioServicio implements IUsuarioServicio{
    
    @Autowired
    private usuarioRepositorio UsuarioRepositorio; 
    
    @Override
    public List<usuario> listarUsuario() {
         return this.UsuarioRepositorio.findAll();
    }

    @Override
    public usuario buscarUsuarioId(Integer idUsuario) {
        usuario usuario = this.UsuarioRepositorio.findById(idUsuario).orElse(null);
       return usuario;
    }

    @Override
    public void guardarUsuario(usuario usuario) {
        this.UsuarioRepositorio.save(usuario);
    }
}
