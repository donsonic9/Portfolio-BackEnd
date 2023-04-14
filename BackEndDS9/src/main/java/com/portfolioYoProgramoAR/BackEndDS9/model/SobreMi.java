
package com.portfolioYoProgramoAR.BackEndDS9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class SobreMi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String second_img;
    private String description;

    public SobreMi() {
    }

    public SobreMi(Long id, String second_img, String description) {
        this.id = id;
        this.second_img = second_img;
        this.description = description;
    }
    
    
    
}
