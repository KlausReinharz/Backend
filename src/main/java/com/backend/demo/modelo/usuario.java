
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


    @Column(name="idusuario")

    private Integer idusuario;
    private String username;
    private String passwords;
    private String email;
    private String sessionactive;
    private Integer persona_idpersona2;
    private String status;

}
