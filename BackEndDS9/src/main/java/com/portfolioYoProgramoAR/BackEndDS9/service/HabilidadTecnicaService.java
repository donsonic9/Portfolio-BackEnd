
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.HabilidadTecnica;
import com.portfolioYoProgramoAR.BackEndDS9.repository.HabilidadTecnicaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadTecnicaService implements IHabilidadTecnicaService {
 
    @Autowired
    public HabilidadTecnicaRepository habtecRepo;

    @Override
    public List<HabilidadTecnica> verHabilidadTecnica() {
        return habtecRepo.findAll();
    }

    @Override
    public void crearHabilidadTecnica(HabilidadTecnica habtec) {
        habtecRepo.save(habtec);
    }

    @Override
    public void borrarHabilidadTecnica(Long id) {
        habtecRepo.deleteById(id);
    }

    @Override
    public void editarHabilidadTecnica(HabilidadTecnica habtec) {
        Optional <HabilidadTecnica> habtectec = habtecRepo.findById(habtec.getId());
        
        if(habtectec.isPresent()) {
            HabilidadTecnica habtecmod = habtectec.get();
            habtecmod.setNombre(habtec.getNombre());
            habtecmod.setLogo_url(habtec.getLogo_url());
            habtecmod.setNivel_o_idioma(habtec.getNivel_o_idioma());
            habtecRepo.save(habtecmod);
        } else {
            throw new RuntimeException ("HabilidadTecnica not found for id: " + habtec.getId());
        }
    }
    
}
