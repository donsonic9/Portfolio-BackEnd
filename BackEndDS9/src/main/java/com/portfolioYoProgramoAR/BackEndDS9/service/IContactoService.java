
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Contacto;
import java.util.List;


public interface IContactoService {
    
    public List <Contacto> verContacto();
    
    public void crearContacto(Contacto cont);
    
    public void borrarContacto(Long id);
    
    public void editarContacto(Contacto cont);
    
}
