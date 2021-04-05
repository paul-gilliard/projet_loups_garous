/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.paulgilliard.projet_loups_garous.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.JoinColumn;
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
public class personnage implements Serializable {

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
        if (!(object instanceof personnage)) {
            return false;
        }
        personnage other = (personnage) object;
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
    
    @JoinColumn
    @ManyToMany
    private List<phase> listDeParole;
    
    @JoinColumn
    @ManyToMany
    private List<phase> listDeEcoute;
    
    @JoinColumn
    @ManyToMany
    private List<phase> listDeVote;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<phase> getListDeParole() {
        return listDeParole;
    }

    public void setListDeParole(List<phase> listDeParole) {
        this.listDeParole = listDeParole;
    }

    public List<phase> getListDeEcoute() {
        return listDeEcoute;
    }

    public void setListDeEcoute(List<phase> listDeEcoute) {
        this.listDeEcoute = listDeEcoute;
    }

    public List<phase> getListDeVote() {
        return listDeVote;
    }

    public void setListDeVote(List<phase> listDeVote) {
        this.listDeVote = listDeVote;
    }


    
    
    
    
    
}
