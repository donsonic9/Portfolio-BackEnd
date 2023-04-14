
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Experiencia;
import com.portfolioYoProgramoAR.BackEndDS9.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public void editarExperiencia(Experiencia expe) {
        Optional <Experiencia> expepe = expeRepo.findById(expe.getId());
        
        if(expepe.isPresent()) {
            Experiencia expemod = expepe.get();
            expemod.setLogo_url(expe.getLogo_url());
            expemod.setPosicionYTiempo(expe.getPosicionYTiempo());
            expemod.setDescription(expe.getDescription());
            expeRepo.save(expemod);
        } else {
            throw new RuntimeException ("Experiencia not found for id: " + expe.getId());
        }
    }
    
}
