package com.ejerciciofinal.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table  ( name = "instrumentosdeviento")
public class InstruEntity {

    @Id
    @Column(name = "id_instrumento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String instrumento;
    private String marca;
    private int stock;

}
