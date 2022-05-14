/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miPrimerApp.sprintgBoot.service;


import com.miPrimerApp.sprintgBoot.model.Experiencia;
import java.util.List;

/**
 *
 * @author Leandro
 */
public interface IExperienciaService 
{
    public void crearExperiencia(Experiencia exp);
    public List<Experiencia> verExperiencia();
    public Experiencia buscarExperiencia(Long id);
    public void actuzaliarExperiencia(Long id,Experiencia exp);
    public void borrarExperiencia(Long id);
}
