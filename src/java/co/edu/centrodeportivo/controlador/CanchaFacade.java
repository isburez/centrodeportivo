/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.centrodeportivo.controlador;

import co.edu.centrodeportivo.entidades.Cancha;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Isaias
 */
@Stateless
public class CanchaFacade extends AbstractFacade<Cancha> {

    @PersistenceContext(unitName = "centrodeportivoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CanchaFacade() {
        super(Cancha.class);
    }
    
}