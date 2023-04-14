
package com.portfolioYoProgramoAR.BackEndDS9.repository;

import com.portfolioYoProgramoAR.BackEndDS9.model.FraseContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseContactoRepository extends JpaRepository <FraseContacto, Long> {
    
}
