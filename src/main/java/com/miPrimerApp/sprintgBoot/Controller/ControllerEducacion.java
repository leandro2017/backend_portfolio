
package com.miPrimerApp.sprintgBoot.Controller;

import com.miPrimerApp.sprintgBoot.model.Educacion;
import com.miPrimerApp.sprintgBoot.service.IEducacionService;
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
public class ControllerEducacion 
{
    @Autowired
    
    private  IEducacionService educacionServi;
    
    
    @PostMapping("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion edu)
    {
       educacionServi.crearEducacion(edu);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public  List<Educacion> verEducacion()
    {
       return educacionServi.verEducacion();
    }
    
    @DeleteMapping("/deleteEducacion/{id}")
    public void borrarEducacion(@PathVariable Long id)
    {
        educacionServi.borrarEducacion(id);
    }
    @PutMapping("/actualizarEducacion/{id}")  
    public void actualizarEducacion(@PathVariable Long id,@RequestBody Educacion edu)
    {
       
        educacionServi.actuzaliarEducacion(id,edu);
    }
}
