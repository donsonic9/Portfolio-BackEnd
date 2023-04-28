
package com.portfolioYoProgramoAR.BackEndDS9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String url_facebook;
    private String url_github;
    private String url_linkedin;
    private String url_instagram;
    private String email;

    public Contacto() {
    }

    public Contacto(Long id, String url_facebook, String url_github, String url_linkedin, String url_instagram, String email) {
        this.id = id;
        this.url_facebook = url_facebook;
        this.url_github = url_github;
        this.url_linkedin = url_linkedin;
        this.url_instagram = url_instagram;
        this.email = email;
    }

    
    
    
    
}
