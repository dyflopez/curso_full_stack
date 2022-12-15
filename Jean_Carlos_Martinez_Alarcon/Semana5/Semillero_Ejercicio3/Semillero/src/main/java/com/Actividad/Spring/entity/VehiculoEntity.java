package com.Actividad.Spring.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vehiculos")
public class VehiculoEntity implements Serializable { // Serializable: pueda crear instancia en tiempos de ejecucion.
                                                        // Estructura para crear una Entity
    @Id
    @Column(name = "id_vehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment de BBDD //
    private int id;
    @Column(name = "placa")
    private String placa;
    @Column(name = "marca")
    private String marca;
    @Column(name = "linea")
    private String linea;
    @Column(name = "modelo")
    private int modelo;

    public VehiculoEntity(int id, String placa, String marca, String linea, int modelo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
    }

    public VehiculoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
