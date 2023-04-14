
package com.portfolioYoProgramoAR.BackEndDS9.repository;

import com.portfolioYoProgramoAR.BackEndDS9.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository <Hero, Long> {
    
}
