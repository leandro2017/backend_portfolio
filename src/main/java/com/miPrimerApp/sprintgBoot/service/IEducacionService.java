package com.miPrimerApp.sprintgBoot.service;

import com.miPrimerApp.sprintgBoot.model.Educacion;
import java.util.List;

/**
 *
 * @author Leandro
 */
public interface IEducacionService 
{
   public void crearEducacion(Educacion edu);
   public List<Educacion> verEducacion();   
   public Educacion buscarEducacion(Long id);
   public void actuzaliarEducacion(Long id,Educacion edu);
   public void borrarEducacion(Long id);
}
