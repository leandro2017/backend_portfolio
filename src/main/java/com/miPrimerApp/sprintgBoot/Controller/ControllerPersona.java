
package com.miPrimerApp.sprintgBoot.Controller;
import com.miPrimerApp.sprintgBoot.model.Persona;
import com.miPrimerApp.sprintgBoot.service.IPersonaService;
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
public class ControllerPersona 
{
    
    @Autowired
    
    private IPersonaService persoSer;
    
   
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers)
    {
        
        persoSer.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public  List<Persona> verPersonas()
    {
       return persoSer.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id)
    {
        persoSer.borrarPersona(id);
    }
    @PutMapping("/actualizar/{id}")  
    public void actualizarPersona(@PathVariable Long id,@RequestBody Persona persona)
    {
       persoSer.actuzaliarPersona(id,persona);
    }
   
}
