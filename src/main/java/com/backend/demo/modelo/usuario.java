
package com.backend.demo.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD

    @Column(name="idusuario")

    private Integer idusuario;
    private String username;
    private String passwords;
    private String email;
    private String sessionactive;
    private Integer persona_idpersona2;
    private String status;
=======
    Integer idUsuario; 
    String username; 
    String passwords; 
    String email;
    String sessionactive;
    Integer persona_idpersona2; 
    String status; 
>>>>>>> c72664650fa5215e46e5a34c37d831f06f81709a
}
