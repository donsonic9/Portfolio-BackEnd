
package com.portfolioYoProgramoAR.BackEndDS9.repository;

import com.portfolioYoProgramoAR.BackEndDS9.model.DescripcionEducacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescripcionEducacionRepository extends JpaRepository <DescripcionEducacion, Long> {
    
}
