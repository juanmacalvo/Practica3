/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import java.util.List;

/**
 *
 * @author Vicky
 */
public class ManejaExperto {

    private Session sesion;
    private Transaction tx;

    public ManejaExperto() {
    }

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

    public void guardaExperto(Experto experto) {
        try {
            iniciaOperacion();
            sesion.save(experto);
            System.out.println("Experto insertado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    
    public void eliminaExperto(Experto experto) {
        try {
            iniciaOperacion();
            sesion.delete(experto);
            System.out.println("Experto eliminado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    
    public void actualizaExperto(Experto experto) {
        try {
            iniciaOperacion();
            sesion.update(experto);
            System.out.println("Experto actualizado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    
    public void obtenerExperto(Experto experto) {
        try {
            iniciaOperacion();
            
            Query query = sesion.createQuery("select e.nombre from Experto as e");
            
            List<String> listaResultados = query.list();
            
            for (int i = 0; i < listaResultados.size(); i++) {
                System.out.println("Nombre "+i+": "+listaResultados.get(i));
            }
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
        
    }
    
        public void listaConParametro(String keyword) throws HibernateException{
        iniciaOperacion();
        String hq1 = "from Experto e where e.especialidad = :keyword";

        Query query =sesion.createQuery(hq1);
        query.setParameter("keyword",keyword);

        List<Experto> listExpertos = query.list();

        for(Experto aExperto : listExpertos) {
            System.out.println(aExperto.getNombre());
        }

        finalizaOperacion();


    }
}
