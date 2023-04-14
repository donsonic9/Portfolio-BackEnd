
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.FraseContacto;
import com.portfolioYoProgramoAR.BackEndDS9.repository.FraseContactoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseContactoService implements IFraseContactoService {
    
    @Autowired
    public FraseContactoRepository fraconRepo;

    @Override
    public List<FraseContacto> verFraseContacto() {
        return fraconRepo.findAll();
    }

    @Override
    public void crearFraseContacto(FraseContacto fracon) {
        fraconRepo.save(fracon);
    }

    @Override
    public void borrarFraseContacto(Long id) {
        fraconRepo.deleteById(id);
    }

    @Override
    public void editarFraseContacto(FraseContacto fracon) {
        Optional <FraseContacto> fraconcon = fraconRepo.findById(fracon.getId());
        
        if (fraconcon.isPresent()) {
            FraseContacto fraconmod = fraconcon.get();
            fraconmod.setFrase_descriptiva(fracon.getFrase_descriptiva());
            fraconmod.setFrase_contacto(fracon.getFrase_contacto());
            fraconRepo.save(fraconmod);
        } else {
            throw new RuntimeException ("FraseContacto not found for id: " + fracon.getId());
        }
    }
    
}
