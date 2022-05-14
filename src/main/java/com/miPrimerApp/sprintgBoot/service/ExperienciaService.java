/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miPrimerApp.sprintgBoot.service;


import com.miPrimerApp.sprintgBoot.model.Experiencia;
import com.miPrimerApp.sprintgBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leandro
 */
 

@Service
public class ExperienciaService implements IExperienciaService
{
     @Autowired
     public ExperienciaRepository expeRepo;
    
    @Override
    public void crearExperiencia(Experiencia exp) 
    {
        expeRepo.save(exp);   
    }

    @Override
    public List<Experiencia> verExperiencia() 
    {
       return expeRepo.findAll();
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
       return expeRepo.findById(id).orElse(null);
    }

    @Override
    public void actuzaliarExperiencia(Long id, Experiencia exp) {
       Experiencia experiencia = expeRepo.findById(id).orElse(null);
       
      if(experiencia != null)
      {
        expeRepo.save(exp);
      }
    }

    @Override
    public void borrarExperiencia(Long id) 
    {
          expeRepo.deleteById(id);
    }
 
}
