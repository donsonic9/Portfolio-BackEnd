
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Educacion;
import com.portfolioYoProgramoAR.BackEndDS9.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        Optional <Educacion> edudu = eduRepo.findById(edu.getId());
        
        if(edudu.isPresent()) {
            Educacion edumod = edudu.get();
            edumod.setImg_url(edu.getImg_url());
            edumod.setTituloYTiempo(edu.getTituloYTiempo());
            edumod.setDescription(edu.getDescription());
            edumod.setInstitucion(edu.getInstitucion());
            eduRepo.save(edumod);
        } else {
            throw new RuntimeException ("Education not found for id : " + edu.getId());
        }
    }
    
}
