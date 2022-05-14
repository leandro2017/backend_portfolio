
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
@Table(name="experiencias")
public class Experiencia
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idexperiencia;
   
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idpersona")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Persona persona;
    
    private String tipo_empleo;
    private String nombre_empresa;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;
   
   
   public Experiencia() 
   {
   }

    public Experiencia(Long idexperiencia, Persona persona, String tipo_empleo, String nombre_empresa, String fecha_inicio, String fecha_fin, String descripcion) {
        this.idexperiencia = idexperiencia;
        this.persona = persona;
        this.tipo_empleo = tipo_empleo;
        this.nombre_empresa = nombre_empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }

    

       
    
}
