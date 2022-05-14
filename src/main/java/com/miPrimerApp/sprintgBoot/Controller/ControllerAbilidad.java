/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miPrimerApp.sprintgBoot.Controller;

import com.miPrimerApp.sprintgBoot.model.Abilidad;
import com.miPrimerApp.sprintgBoot.service.IAbilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leandro
 */
@RestController
public class ControllerAbilidad 
{
    @Autowired
    
    private IAbilidadService abiSer;
    
   
    
    @PostMapping("/new/abilidad")
    public void agregarAbilidad(@RequestBody Abilidad abi)
    {
        
        abiSer.crearAbilidad(abi);
    }
    
    @GetMapping("/ver/abilidades")
    @ResponseBody
    public  List<Abilidad> verAbilidades()
    {
       return abiSer.verAbilidades();
    }
    
    @DeleteMapping("/deleteAbilidad/{id}")
    public void borrarAbilidad(@PathVariable Long id)
    {
        abiSer.borrarAbilidad(id);
    }
    @PutMapping("/actualizarAbilidad/{id}")  
    public void actualizarAbilidad(@PathVariable Long id,@RequestBody Abilidad abi)
    {
       abiSer.actuzaliarAbilidad(id,abi);
    }    
}
