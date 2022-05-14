
package com.miPrimerApp.sprintgBoot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity 
@Table(name="personas")
public class Persona 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpersona;
    
    private String nombre;
    private String apellido;
    private String domicilio;
    private String telefono;
    private String correo;
    private int edad;
    // acerca de mi
    private String descripcion;
    private String titulo;
    private String url_foto;
    
     @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
     private List<Experiencia> experiencias;
    
    
//    @OneToMany(mappedBy = "personas" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JsonIgnore
//    private List<Experiencia> experiencias;
//
//    public Persona(Long idpersona, String nombre, String apellido, String domicilio, String telefono, String correo, int edad, String descripcion, String titulo, String url_foto, List<Experiencia> experiencias) {
//        this.idpersona = idpersona;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.domicilio = domicilio;
//        this.telefono = telefono;
//        this.correo = correo;
//        this.edad = edad;
//        this.descripcion = descripcion;
//        this.titulo = titulo;
//        this.url_foto = url_foto;
//        this.experiencias = experiencias;
//    }

   
    

    public Persona() {
    }
//    public Persona(Long id, String nombre, String apellido) {
//        this.idpersona = id;
//        this.nombre = nombre;
//        this.apellido = apellido;
//    }

    public Persona(Long idpersona, String nombre, String apellido, String domicilio, String telefono, String correo, int edad, String descripcion, String titulo, String url_foto) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.url_foto = url_foto;
        
    }

    
    
    
    
}
