/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.paulgilliard.projet_loups_garous.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinTable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author paul
 */
@Entity
public class Personnage implements Serializable {

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
        if (!(object instanceof Personnage)) {
            return false;
        }
        Personnage other = (Personnage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.paulgilliard.projet_loups_garous.entity.personnage[ id=" + id + " ]";
    }
    
    private String nom;
    
    @JoinTable(name = "parole")
    @ManyToMany
    private List<Phase> parole;
    
    @JoinTable(name = "ecoute")
    @ManyToMany
    private List<Phase> ecoute;
    
    @JoinTable(name = "vote")
    @ManyToMany
    private List<Phase> vote;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Phase> getParole() {
        return parole;
    }

    public void setParole(List<Phase> parole) {
        this.parole = parole;
    }

    public List<Phase> getEcoute() {
        return ecoute;
    }

    public void setEcoute(List<Phase> ecoute) {
        this.ecoute = ecoute;
    }

    public List<Phase> getVote() {
        return vote;
    }

    public void setVote(List<Phase> vote) {
        this.vote = vote;
    }




    
    
    
    
    
}
