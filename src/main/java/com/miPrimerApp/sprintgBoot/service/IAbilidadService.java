
package com.miPrimerApp.sprintgBoot.service;

import com.miPrimerApp.sprintgBoot.model.Abilidad;
import java.util.List;

/**
 *
 * @author Leandro
 */
public interface IAbilidadService 
{
    public List<Abilidad> verAbilidades();
    public void crearAbilidad(Abilidad abi);
    public void borrarAbilidad(Long id);
    public Abilidad buscarAbilidad(Long id);
    public void actuzaliarAbilidad(Long id,Abilidad abi);
}