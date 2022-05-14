/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miPrimerApp.sprintgBoot.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * author Leandro
 */
@Getter @Setter
@Entity 
@Table(name="educacion")
public class Educacion 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idexperiencia;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idpersona")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Persona persona;
    
    
    private String titulo;
    private String nombre;
    private String Descripcion;
   
//    public enum estados 
//    {
//    ONE, TWO, THREE, FOUR, FIVE
//    }
//    @Enumerated(EnumType.STRING)
    private String estado;

    public Educacion(Long idexperiencia, Persona persona, String titulo, String nombre, String Descripcion, String estado) {
        this.idexperiencia = idexperiencia;
        this.persona = persona;
        this.titulo = titulo;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.estado = estado;
    }

    public Educacion() {
    }
    
    
    
}



