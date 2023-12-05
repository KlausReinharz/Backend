
package com.backend.demo.servicio;
import com.backend.demo.modelo.usuario;
import java.util.List;


public interface IUsuarioServicio {
    public List<usuario> listarUsuario();
    public usuario buscarUsuarioId(Integer idUsuario);
    public void guardarUsuario(usuario usuario);
}
