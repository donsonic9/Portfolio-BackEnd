
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.SobreMi;
import com.portfolioYoProgramoAR.BackEndDS9.repository.SobreMiRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SobreMiService implements ISobreMiService {
    
    @Autowired
    public SobreMiRepository sobremiRepo;

    @Override
    public List<SobreMi> verSobreMi() {
        return sobremiRepo.findAll();
    }

    @Override
    public void crearSobreMi(SobreMi sobrem) {
        sobremiRepo.save(sobrem);
    }

    @Override
    public void borrarSobreMi(Long id) {
        sobremiRepo.deleteById(id);
    }

    @Override
    public void editarSobreMi(SobreMi sobrem) {
        Optional <SobreMi> sobremimi = sobremiRepo.findById(sobrem.getId());
        
        if(sobremimi.isPresent()) {
            SobreMi sobremimod = sobremimi.get();
            sobremimod.setDescription(sobrem.getDescription());
            sobremimod.setSecond_img(sobrem.getSecond_img());
            sobremiRepo.save(sobremimod);
        } else {
            throw new RuntimeException("SobreMi not found for id :: " + sobrem.getId());
        }
    }
    
}
