/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import java.util.List;
/**
 *
 * @author usuario
 */
public class ManejaCaso {
    
    private Session sesion;
    private Transaction tx;
    
    public void iniciaOperacion() throws HibernateException {
        System.out.println("Comenzando con Hibernate");
        sesion = NewHibernateUtil.getSessionFactory().openSession(); //iniciamos una sesion hibernate
        tx = sesion.beginTransaction(); // comienza la transaccion
    }
    
    public void finalizaOperacion() throws HibernateException {
        System.out.println("Finalizando con Hibernate");
        tx.commit();
        sesion.close();
    }

    public void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        System.out.println("Ocurrió un error en la capa de acceso a datos " + he.getMessage());
        System.exit(0);
    }
    
    public void guardaCaso(CasoPolicial caso){
        try {
            iniciaOperacion();
            sesion.save(caso);
            System.out.println("Caso insertado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    public void borraCaso(CasoPolicial caso){
        try {
            iniciaOperacion();
            sesion.delete(caso);
            System.out.println("Casos Borrado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    public ArrayList<CasoPolicial> listCaso() throws SQLException {
        try {
            iniciaOperacion();
            ArrayList<CasoPolicial> exp = new ArrayList<CasoPolicial>();
            String sentence = "select * from CasoPolicial";
            Query query = sesion.createQuery(sentence);
            List<CasoPolicial> lista = query.list();
            for (int i = 0; i < lista.size() ; i++) {
                exp.add(lista.get(i));
            }
            System.out.println("Casos Recuperado correctamente");
            return exp;
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
}
