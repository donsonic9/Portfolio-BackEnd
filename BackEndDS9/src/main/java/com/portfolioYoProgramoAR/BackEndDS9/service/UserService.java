
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.User;
import com.portfolioYoProgramoAR.BackEndDS9.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    
    @Autowired
    public UserRepository userRepo;

    @Override
    public List<User> verUser() {
        return userRepo.findAll();
    }

    @Override
    public void crearUser(User use) {
        userRepo.save(use);
    }

    @Override
    public void borrarUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void editarUser(User use) {
        Optional <User> opuser = userRepo.findById(use.getId());
        
        if(opuser.isPresent()) {
            User usermod = opuser.get();
            usermod.setEmail(use.getEmail());
            usermod.setUserName(use.getUserName());
            usermod.setPassword(use.getPassword());
            userRepo.save(usermod);
        } else {
            throw new RuntimeException("User not found for id :: " + use.getId());
        }
            
    }
    
    
    
}
