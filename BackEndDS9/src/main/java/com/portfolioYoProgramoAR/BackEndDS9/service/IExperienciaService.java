
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List <Experiencia> verExperiencia();
    
    public void crearExperiencia(Experiencia expe);
    
    public void borrarExperiencia(Long id);
    
    public void editarExperiencia(Experiencia expe);
    
}
