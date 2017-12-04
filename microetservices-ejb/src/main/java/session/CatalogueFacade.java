/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Catalogue;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Merle
 */
@Stateless
public class CatalogueFacade extends AbstractFacade<Catalogue> {

    @PersistenceContext(unitName = "microetservicesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogueFacade() {
        super(Catalogue.class);
    }
    
}
