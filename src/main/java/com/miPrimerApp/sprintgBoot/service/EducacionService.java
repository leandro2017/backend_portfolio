/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miPrimerApp.sprintgBoot.service;

import com.miPrimerApp.sprintgBoot.model.Educacion;
import com.miPrimerApp.sprintgBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leandro
 */
@Service
public class EducacionService implements IEducacionService
{

    public EducacionRepository eduRepo;
    
    @Override
    public void crearEducacion(Educacion edu) 
    {
       eduRepo.save(edu);
    }

    @Override
    public List<Educacion> verEducacion() 
    {
        return eduRepo.findAll(); 
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void actuzaliarEducacion(Long id, Educacion edu) {
       Educacion educacion = eduRepo.findById(id).orElse(null);
       
      if(educacion != null)
      {
        eduRepo.save(edu);
      }
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }
    
}
