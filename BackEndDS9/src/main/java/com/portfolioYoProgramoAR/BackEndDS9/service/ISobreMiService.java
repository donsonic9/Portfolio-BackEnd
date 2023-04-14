
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.SobreMi;
import java.util.List;


public interface ISobreMiService {
    
    public List <SobreMi> verSobreMi();
    
    public void crearSobreMi(SobreMi sobrem);
    
    public void borrarSobreMi(Long id);
    
    public void editarSobreMi(SobreMi sobrem);
    
}
