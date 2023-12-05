package com.backend.demo.security;

import com.backend.demo.modelo.usuario;
import com.backend.demo.repositorio.usuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private usuarioRepositorio UsuarioRepositorio;

    @Override
    public UserDetails loadUserByUsername(String email)throws UsernameNotFoundException{
        usuario Usuario =UsuarioRepositorio.findOneByEmail(email)
                .orElseThrow(()-> new UsernameNotFoundException("El usuario con email"+email+"no existe"));
        return new UserDetailImpl(Usuario);
    }



}
