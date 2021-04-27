/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.paulgilliard.projet_loups_garous.jpa;

import fr.insset.paulgilliard.projet_loups_garous.entity.Partie;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author paul
 */
@Stateless
public class PartieFacade extends AbstractFacade<Partie> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PartieFacade() {
        super(Partie.class);
    }
    
}
