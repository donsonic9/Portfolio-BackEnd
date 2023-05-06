
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Mensaje;
import java.util.List;


public interface IMensajeService {
    
    public List <Mensaje> verMensaje();
    
    public void crearMensaje(Mensaje men);
    
    public void borrarMensaje(Long id);
    
    public void editarMensaje(Mensaje men);
    
}
