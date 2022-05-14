/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miPrimerApp.sprintgBoot.Controller;

import com.miPrimerApp.sprintgBoot.model.Experiencia;
import com.miPrimerApp.sprintgBoot.model.Persona;
import com.miPrimerApp.sprintgBoot.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leandro
 */
@RestController
public class ControllerExperiecia 
{
     @Autowired
     
     private IExperienciaService expSer;
     private Persona per=new Persona();
   
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public  List<Experiencia> verExperiencias()
    {
       return expSer.verExperiencia();
    }
    
    @PostMapping("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia experiencia)
    {
        
        expSer.crearExperiencia(experiencia);    
       
        
    }
}
