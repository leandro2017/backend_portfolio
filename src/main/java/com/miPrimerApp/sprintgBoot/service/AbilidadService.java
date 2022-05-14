
package com.miPrimerApp.sprintgBoot.service;

import com.miPrimerApp.sprintgBoot.model.Abilidad;
import com.miPrimerApp.sprintgBoot.repository.AbilidadRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leandro
 */
@Service
public class AbilidadService implements IAbilidadService
{

    public AbilidadRepository abiRepo;
    
    
    @Override
    public List<Abilidad> verAbilidades() 
    {
          return abiRepo.findAll();
    }

    @Override
    public void crearAbilidad(Abilidad abi) 
    {
        abiRepo.save(abi);
    }

    @Override
    public void borrarAbilidad(Long id) {
        abiRepo.deleteById(id);
    }

    @Override
    public Abilidad buscarAbilidad(Long id) {
        return  abiRepo.findById(id).orElse(null);
    }

    @Override
    public void actuzaliarAbilidad(Long id, Abilidad abi) 
    {
      Abilidad abilidad = abiRepo.findById(id).orElse(null);
       
      if(abilidad != null)
      {
        abiRepo.save(abi);
      }   
    }
    
}
