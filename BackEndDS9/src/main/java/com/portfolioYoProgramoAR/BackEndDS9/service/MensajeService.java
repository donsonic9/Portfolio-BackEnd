
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Mensaje;
import com.portfolioYoProgramoAR.BackEndDS9.repository.MensajeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeService implements IMensajeService {
    
    @Autowired
    public MensajeRepository menRepo;

    @Override
    public List<Mensaje> verMensaje() {
        return menRepo.findAll();
    }

    @Override
    public void crearMensaje(Mensaje men) {
        menRepo.save(men);
    }

    @Override
    public void borrarMensaje(Long id) {
        menRepo.deleteById(id);
    }

    @Override
    public void editarMensaje(Mensaje men) {
        Optional <Mensaje> menpe = menRepo.findById(men.getId());
        
        if(menpe.isPresent()) {
            Mensaje menmod = menpe.get();
            menmod.setFecha(men.getFecha());
            menmod.setUsername(men.getUsername());
            menmod.setMensaje(men.getMensaje());
            menmod.setEmail(men.getEmail());
            menmod.setImg_photo(men.getImg_photo());
            
            menRepo.save(menmod);
        } else {
            throw new RuntimeException ("Mensaje not found for id: " + men.getId());
        }
    }
    
    
    
}
