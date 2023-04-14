
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.DescripcionEducacion;
import java.util.List;


public interface IDescripcionEducacionService {
    
    public List <DescripcionEducacion> verDescripcionEducacion();
    
    public void crearDescripcionEducacion(DescripcionEducacion descedu);
    
    public void borrarDescripcionEducacion(Long id);
    
    public void editarDescripcionEducacion(DescripcionEducacion descedu);
    
}
