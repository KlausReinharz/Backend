
package com.backend.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    Integer idUsuario; 
    String username; 
    String passwords; 
    String email;
    String sessionactive;
    Integer persona_idpersona2; 
    String status; 
}
