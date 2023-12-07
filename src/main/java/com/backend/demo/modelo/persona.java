
package com.backend.demo.modelo;

import jakarta.persistence.*;

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
    @Column(name="idpersona")
    private Integer idpersona;
    private String nombre;
    private String apellido;
    private String identificacion;
    private Date fechanacimiento;
}
