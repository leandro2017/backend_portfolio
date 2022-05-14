
package com.miPrimerApp.sprintgBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
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
 * @author Leandro
 */
@Getter @Setter
@Entity 
@Table(name="abilidad")
public class Abilidad 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idabilidad;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idpersona")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Persona persona;
    
    private String nombre;
    private int porcentaje;
    private String descripcion;
}
