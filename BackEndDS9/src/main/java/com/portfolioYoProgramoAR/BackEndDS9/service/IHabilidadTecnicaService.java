
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.HabilidadTecnica;
import java.util.List;


public interface IHabilidadTecnicaService {
    
    public List <HabilidadTecnica> verHabilidadTecnica();
    
    public void crearHabilidadTecnica(HabilidadTecnica habtec);
    
    public void borrarHabilidadTecnica(Long id);
    
    public void editarHabilidadTecnica(HabilidadTecnica habtec);
    
}
