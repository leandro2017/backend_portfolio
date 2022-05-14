
package com.miPrimerApp.sprintgBoot.repository;

import com.miPrimerApp.sprintgBoot.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro
 */


@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
