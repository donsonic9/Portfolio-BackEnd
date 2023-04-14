
package com.portfolioYoProgramoAR.BackEndDS9.repository;

import com.portfolioYoProgramoAR.BackEndDS9.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {
    
}
