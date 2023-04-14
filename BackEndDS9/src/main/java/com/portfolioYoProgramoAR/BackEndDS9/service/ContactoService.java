
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Contacto;
import com.portfolioYoProgramoAR.BackEndDS9.repository.ContactoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IContactoService{
    
    @Autowired
    public ContactoRepository contactRepo;

    @Override
    public List<Contacto> verContacto() {
        return contactRepo.findAll();
    }

    @Override
    public void crearContacto(Contacto cont) {
        contactRepo.save(cont);
    }

    @Override
    public void borrarContacto(Long id) {
        contactRepo.deleteById(id);
    }

    @Override
    public void editarContacto(Contacto cont) {
        Optional <Contacto> conton = contactRepo.findById(cont.getId());
        
        if (conton.isPresent()) {
            Contacto contactmod = conton.get();
            contactmod.setMedio_de_contacto(cont.getMedio_de_contacto());
            contactmod.setUrl_medio(cont.getUrl_medio());
            contactRepo.save(contactmod);
        } else {
            throw new RuntimeException ("Contacto not found for id: " + cont.getId());
        }
    }
    
}
