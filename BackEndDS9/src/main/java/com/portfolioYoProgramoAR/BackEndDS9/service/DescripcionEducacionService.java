
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.DescripcionEducacion;
import com.portfolioYoProgramoAR.BackEndDS9.repository.DescripcionEducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescripcionEducacionService implements IDescripcionEducacionService {
    
    @Autowired
    public DescripcionEducacionRepository desceduRepo;

    @Override
    public List<DescripcionEducacion> verDescripcionEducacion() {
        return desceduRepo.findAll();
    }

    @Override
    public void crearDescripcionEducacion(DescripcionEducacion descedu) {
        desceduRepo.save(descedu);
    }

    @Override
    public void borrarDescripcionEducacion(Long id) {
        desceduRepo.deleteById(id);
    }

    @Override
    public void editarDescripcionEducacion(DescripcionEducacion descedu) {
        Optional <DescripcionEducacion> descedudu = desceduRepo.findById(descedu.getId());
        
        if(descedudu.isPresent()) {
            DescripcionEducacion descedumod = descedudu.get();
            descedumod.setDescription(descedu.getDescription());
            desceduRepo.save(descedumod);
        } else {
            throw new RuntimeException ("DescripcionEducacion not found for id: " + descedu.getId());
        }
    }
    
}
