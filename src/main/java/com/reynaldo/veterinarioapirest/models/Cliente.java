package com.reynaldo.veterinarioapirest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value={"hibernateLazyInitializer","Handler","cliente"})
    List<Mascota> mascotas;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value={"hibernateLazyInitializer","Handler","cliente"},allowSetters = true)
    List<Boleta> boletas;

    public  Cliente(){
        this.mascotas = new ArrayList<>();
        this.boletas = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public List<Boleta> getBoletas() {
        return boletas;
    }

    public void setBoletas(List<Boleta> boletas) {
        this.boletas = boletas;
    }
}
