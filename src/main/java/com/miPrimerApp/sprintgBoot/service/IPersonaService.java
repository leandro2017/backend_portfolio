/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miPrimerApp.sprintgBoot.service;


import com.miPrimerApp.sprintgBoot.model.Persona;
import java.util.List;


/**
 *
 * @author Leandro
 */
public interface IPersonaService 
{
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public void actuzaliarPersona(Long id,Persona per);
    
}
