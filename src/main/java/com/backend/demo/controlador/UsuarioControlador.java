
package com.backend.demo.controlador;

import com.backend.demo.modelo.usuario;
import com.backend.demo.servicio.UsuarioServicio;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*http://localhost:9090/usuarios-app*/
@RequestMapping("usuarios-app")
@CrossOrigin(value="http://localhost:4200")

public class UsuarioControlador {
    private static final Logger logger =
            LoggerFactory.getLogger(UsuarioControlador.class);
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @GetMapping("/usuario")
    public List<usuario>obtenerUsuario(){
        List<usuario>usuarios = this.usuarioServicio.listarUsuario();
        logger.info("Usuarios Obtenidos");
        return usuarios;
    }
    
}
