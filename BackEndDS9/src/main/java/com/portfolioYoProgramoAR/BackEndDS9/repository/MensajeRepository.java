
package com.portfolioYoProgramoAR.BackEndDS9.repository;

import com.portfolioYoProgramoAR.BackEndDS9.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository <Mensaje, Long>{
    
}
