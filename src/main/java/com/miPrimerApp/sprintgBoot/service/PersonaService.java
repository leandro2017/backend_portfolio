
package com.miPrimerApp.sprintgBoot.service;


import com.miPrimerApp.sprintgBoot.model.Persona;
import com.miPrimerApp.sprintgBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leandro
 */

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    
    public PersonaRepository persoRepo;
   
   
    
    @Override
    public List<Persona> verPersonas() {
     
        return persoRepo.findAll();
        
    }

    @Override
    public void crearPersona(Persona per) {
        
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        
        
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void actuzaliarPersona(Long id,Persona per) 
    {
      Persona persona = persoRepo.findById(id).orElse(null);
       
      if(persona != null)
      {
        persoRepo.save(per);
      }
   }
  }
