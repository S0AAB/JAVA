package com.estudio.BasicAPI.models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "users")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombres;

    @Column
    private String apellidos;

    @Column(unique = true)
    private String telefono;

    @Column
    @Enumerated
    private EnumEstado estado;

    @CreatedDate
    @Column
    private Date fechaCreacion;

}
