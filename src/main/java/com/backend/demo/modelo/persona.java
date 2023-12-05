
package com.backend.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idpersona; 
    String nombre;
    String apellido;
    String identificacion;
    Date fechanacimiento; 
}
