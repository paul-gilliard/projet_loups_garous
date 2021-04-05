/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.paulgilliard.projet_loups_garous.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author paul
 */
@Entity
public class partie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof partie)) {
            return false;
        }
        partie other = (partie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.paulgilliard.projet_loups_garous.entity.partie[ id=" + id + " ]";
    }
    


    public List<joueur> getListDeJoueurs() {
        return listDeJoueurs;
    }

    public void setListDeJoueurs(List<joueur> listDeJoueurs) {
        this.listDeJoueurs = listDeJoueurs;
    }

    public List<participation> getListDeParticipations() {
        return listDeParticipations;
    }

    public void setListDeParticipations(List<participation> listDeParticipations) {
        this.listDeParticipations = listDeParticipations;
    }

    public List<personnage> getListDePersonnages() {
        return listDePersonnages;
    }

    public void setListDePersonnages(List<personnage> listDePersonnages) {
        this.listDePersonnages = listDePersonnages;
    }
    
    
    
    @OneToMany
    private List<joueur> listDeJoueurs;
    
    @OneToMany
    private List<participation> listDeParticipations;
    
    @OneToMany
    private List<personnage> listDePersonnages;
    
    
}
