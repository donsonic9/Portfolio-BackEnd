
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List <Educacion> verEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
    
    public void editarEducacion(Educacion edu);
    
}
